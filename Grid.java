import java.util.Arraylist;

class Grid {

  private int counter;

  public Grid() {
    this.inputBoard();
    return;

    Arraylist<String> queue = new Arraylist<String>();
    Arraylist<String> moves = new Arraylist<String>();
    // this.getStartBoard();  //sets initialState variable
    // this.getEndBoard(); //sets goalState variable
    this.counter = 0;  //start counter at 0
    //
    // //code will find every possible move,
    // while(true){    //continue looping until break is reached
    //
    //   this.currentNode = queue.get(this.counter); // set currentNode to queue
    //   //array item with intex counter
    //   //find, check for presence and add for Lmove;
    //   String lmove = getLMove(this.currentNode);
    //   if(lmove == this.goalState){
    //     moves.add(lmove);
    //     System.out.println("Goal state reached");
    //     break;
    //   } else if(!queue.contains(lmove) && lmove != null){
    //     queue.add(lmove);
    //     moves.add("L");
    //   }
    //   //find, check for presence and add for Rmove
    //   String rmove = findRmove();
    //   if(rmove == this.goalState){
    //     moves.add(rmove);
    //     break;
    //   } else if(!queue.contains(rmove) && rmove != null){
    //     queue.add(rmove);
    //     moves.add("R");
    //   }
    //   //find, check for presence and add for Umove
    //   String umove = findUmove();
    //   if(umove == this.goalState){
    //     moves.add(this.Umove);
    //     break;
    //   } else if(!queue.contains(umove) && umove != null){
    //     queue.add(umove);
    //     moves.add("U");
    //   }
    //   //find, check for presence and add for Dmove
    //   String dmove = getLMove();
    //   if(dmove == this.goalState){
    //     moves.add(dmove);
    //     break;
    //   } else if(!queue.contains(dmove) && dmove != null){
    //     queue.add(dmove);
    //     moves.add("D");
    //   }
    //   counter();
    // }
  }

}
