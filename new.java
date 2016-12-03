import java.util.Scanner;
import java.util.Arraylist;
public class Main {

// *********** INITIALISING**************
  public String initialState;
  public String goalState;
  public String currentNode;
  public int counter;

  static Scanner userInput = new Scanner(System.in);


  public void setState(String init){
    this.initialState = init;
    addToQueue(self.initialState);
  }

  public void setGoal(String goal){
    this.goalState = goal;
  }
  //set initial state by asking user for input
  public void getInputInit(){
    System.out.println("Enter initial board state: ");
    if(userInput.hasNextLine()){
      // & String.length(userInput.nextLine())
      this.setState(userInput.nextLine());
    }
    else{
      System.out.println("Invalid input, must be string of length 9");
      getInputInit();
  }
  }
  //set goal state by asking user for input
  public void getInputGoal(){
    System.out.println("Enter goal board state: ");
    if(userInput.hasNextLine()){
      // & String.length(userInput.nextLine())
      this.setGoal(userInput.nextLine());
    }
    else{
      System.out.println("Invalid input, must be string of length 9");
      getInputGoal();
    }
  }

  //// Queue adders and getters ///////////////////////////////////
  public void counter(){    //method adds one to counter variable evertime its called
    self.counter++;
  }

  public void addToQueue(String item){   //adds item to queue arraylist
    queue.add(item);
  }

  public void addToMoves(String item){ //adds item to moves arraylist
    moves.add(item);
  }

  public Boolean inQueue(String item){ //method checks if String item is in queue array
    self.queue.contains(item);
  }
  //////////////////////////////////////////////

  ///////// methods for making move of 0 piece ////////////

  public int findIndex0(String item){   //finds index of 0 in string
    return string.toCharArray(item).indexof(0);
  }

  public swapItems(int index0, int indexOther, String item){ //swaps 0 and item in string
    //string.toCharArry(item).replace(index0, string.toCharArry(item)[indexOther]);
    //string.toCharArry(item).replace(indexOther, 0);
    return item;
  }


  ////// Move checkers ////////////////////

  public String findLmove(String item){  //method returns board with 0 piece moved 1 place left
    int index0;
    self.index0 = self.findIndex0(item);
    System.out.println("0 index = " +self.index0);
    switch(self.index0){
    case 0:     //if no left moves is possible, return 0
    case 3:
    case 6:
      return 0;
    case 1:
      return self.swapItems(self.index0, 1, item);
    case 2:
      return self.swapItems(self.index0, 2, item);
    case 4:
      return self.swapItems(self.index0, 4, item);
    case 5:
      return self.swapItems(self.index0, 5, item);
    case 7:
      return self.swapItems(self.index0, 7, item);
    case 8:
      return self.swapItems(self.index0, 8, item);

    }
  }





  //main function
  public Main(){
    Arraylist<String> queue = new Arraylist<String>(1);
    Arraylist<String> moves = new Arraylist<String>(1);
    this.getInputInit();  //sets initialState variable
    this.getInputGoal(); //sets goalState variable
    self.counter = 0;  //start counter at 0

    while(True){    //continue looping until break is reached

      self.currentNode = self.queue.get(self.counter); // set currentNode to queue
                                                     //array item with intex counter
      //find, check for presence and add for Lmove
      String Lmove;
      self.Lmove = findLmove(self.currentNode);
      if(self.Lmove = self.goalState){
        addToMoves(self.Lmove);
        System.out.println("Goal state reached");
        break;
      elseif(!inQueue(self.Lmove) & self.Lmove != 0){
        addToQueue(self.Lmove);
        addToMoves("L");
      }
      }
      //find, check for presence and add for Rmove
      self.Rmove = findRmove();
      if(self.Rmove = self.goalState){
        addToMoves(self.Rmove);
        break;
      elseif(!inQueue(self.Rmove) & self.Rmove != 0){
        addToQueue(self.Rmove);
        addToMoves("R");
      }
      }
      //find, check for presence and add for Umove
      self.Umove = findUmove();
      if(self.Umove = self.goalState){
        addToMoves(self.Umove);
        break;
      elseif(!inQueue(self.Umove) & self.Umove != 0){
        addToQueue(self.Umove);
        addToMoves("U");
      }
      }
      //find, check for presence and add for Dmove
      self.Dmove = DindLmove();
      if(self.Dmove = self.goalState){
        addToMoves(self.Dmove);
        break;
      elseif(!inQueue(self.Dmove) & self.Dmove != 0){
        addToQueue(self.Dmove);
        addToMoves("D");
      }
      }
    counter();
    }
  }


  public static void main(String[] args){
      Main main = new Main();
    }
}

//things to ask big H
//line 129 syntax errors :(
//swap letters??
