/*
 * Project: Chessboard
 * Name: Youcef O'Connor
 * Number: x*******
 * Date: 20/12/16
 */

import java.util.*;


public class AIAgent{
  Random rand;

  public AIAgent(){
    rand = new Random();
  }

//Creating instances of the three strategies
  public Move MethodPicked(int picked, Stack possibilities){
    Move selectedMove = new Move();
    if(picked==0){
      selectedMove = randomMove(possibilities);
      return selectedMove;
    }
    else if(picked==1){
      selectedMove = nextBestMove(possibilities);
      return selectedMove;
    }
    else{
      selectedMove = twoLevelsDeep(possibilities);
      return selectedMove;
    }
  }

/*
  The method randomMove takes as input a stack of potential moves that the AI agent
  can make. The agent uses a rondom number generator to randomly select a move from
  the inputted Stack and returns this to the calling agent.
*/

  //Random Move
  public Move randomMove(Stack possibilities){

    int moveID = rand.nextInt(possibilities.size());
    System.out.println("Agent randomly selected move : "+moveID);
    for(int i=1;i < (possibilities.size()-(moveID));i++){
      possibilities.pop();
    }
    Move selectedMove = (Move)possibilities.pop();//sends the random selected move to the AI Agant
    return selectedMove;
  }

  //Next Best Move
  public Move nextBestMove(Stack possibilities){
    int moveID = rand.nextInt(possibilities.size());
    int HighestPoints = 0;
    Move selectedMove = null;
    System.out.println("AI Agent has found the best location");

    //Looks for the highest piece, King is the Goal
    while(0<(possibilities.size())){

      Move move = (Move) possibilities.pop(); //Creating instance of each move and passing them to the stack

      if(!(possibilities.size()==1)){ //if the stack is not empty
        if((HighestPoints) < (move.getPoints())){//if highest points are greater than the stack
          HighestPoints = move.getPoints(); //then go get Highest points
          selectedMove = move; //move to selected move
        }
      }
      if((possibilities.size()==1) && HighestPoints==0){
        selectedMove = (Move)possibilities.pop();
      }

    }
    return selectedMove;
  }


  //Two Levels Deep
  public Move twoLevelsDeep(Stack possibilities){
    Move selectedMove = new Move();
    return selectedMove;
  }


}
