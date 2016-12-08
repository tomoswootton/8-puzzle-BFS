import java.util.ArrayList;
import java.util.Scanner;

public class Main {

// *********** INITIALISING**************

// create scanner for inputs
static Scanner userInput = new Scanner(System.in);

public static ArrayList queue = new ArrayList();
public static ArrayList moves = new ArrayList();

  public static void main(String[] args){
    //inputs initial board and goal board states
    //String initialState = Main.inputBoard("enter initial");
    //String goalState = Main.inputBoard("enter goal");
    //Grid.setInitialState(initialState);
    Grid.setInitialState("123405678");
    //Grid.setGoalState(goalState);
    Grid.setGoalState("123450678");


    //for initial board state
    //add each initail move to queue
    for (String move: new String[]{"L", "R", "U", "D"}){
      //create grid of each move
      Grid grid = new Grid(new Grid(), move);
      //add each grid to queue
      queue.add(grid);
    }
    //with the first 4 moves added, run through queue finding children of each
    //item and check if each item is equal to the goal state
    Main.runThroughQueue();

  }

  public static void runThroughQueue(){
    //loop until i is the length of the queue, which will only happen if no solution is found
    int i = 0;
    while (i < queue.size()) {
      //grab first item in queue array
      Grid currentGrid = queue.get(0);
      //apply getChidlren method to item, this method will stop the program if
      //one of the children is equal to goal state
      currentGrid.getChildren();
      i++;
    }
    System.out.println("queue" + queue);
    System.out.println("no solution found");
    System.exit(0);
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
}
//line 47, want ot put getChildren method on value of i in queue
//whats tosTring for
