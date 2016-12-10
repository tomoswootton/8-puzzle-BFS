import java.util.ArrayList;
import java.util.Scanner;

public class Main {

// *********** INITIALISING**************

// create scanner for inputs
static Scanner userInput = new Scanner(System.in);

public static ArrayList<Grid> known_grids = new ArrayList<Grid>();
public static ArrayList<Grid> todo_grids = new ArrayList<Grid>();


  public static void main(String[] args){
    //inputs initial board and goal board states
    //String initialState = Main.inputBoard("enter initial");
    //String goalState = Main.inputBoard("enter goal");
    //Grid.setInitialState(initialState);
    Grid.setInitialState("152046873");
    //Grid.setGoalState(goalState);
    Grid.setGoalState("123456780");


    //for initial board state
    //add each initial move to queue
    known_grids.add(new Grid());
    todo_grids.add(new Grid());

    Main.runThroughQueue();

  }

  //TODO: REDO COMMENTS
  public static void runThroughQueue(){
    //loop until i is the length of the queue, which will only happen if no solution is found
    while (todo_grids.size()>0) {
      //grab first item in queue array and set it as parent for
      Grid currentGrid = todo_grids.get(0);
      //remove item from queue
      todo_grids.remove(0);

      System.out.println(known_grids.size());
      System.out.println(todo_grids.size());
      System.out.println(currentGrid);

      //apply getChidlren method to item, this method will stop the program if
      //one of the children is equal to goal state
      if (currentGrid.getState().equals(Grid.getGoalState())){
        Main.endProgram(currentGrid);
      }

      ArrayList<Grid> children = currentGrid.getChildren();
      for(Grid child: children){
        if(!known_grids.contains(child)){
          known_grids.add(child);
          todo_grids.add(child);
        }
      }
    }
    System.out.println("no solution found");
  }
  //inputs code ensures inputs are not null and of length 9
  private static String inputBoard(String msg){
    String inp = null;
    do {
      System.out.println(msg);
      if (userInput.hasNextLine()) {
        inp = userInput.nextLine();
      }
    } while(inp.length() != 9);
    return inp;
  }

  //method stops program when goal state is reached
  public static void endProgram(Grid grid){
    System.out.println("state of winner: "+ grid.getState());
    grid.displayPath();
    System.exit(0);
  }
}
