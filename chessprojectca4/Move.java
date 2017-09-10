/*
 * Project: Chessboard
 * Name: Youcef O'Connor
 * Number: x*******
 * Date: 20/12/16
 */

class Move{
  Square start;
  Square landing;
  int points;

  public Move(Square x, Square y, int z){
    start = x;
    landing = y;
    points = z;
  }

  public Move(){

  }

  public Square getStart(){
    return start;
  }

  public int getPoints(){
    return points;
  }

  public Square getLanding(){
    return landing;
  }
}
