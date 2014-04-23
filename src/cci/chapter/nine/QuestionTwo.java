package cci.chapter.nine;

public class QuestionTwo {

  public static void main(String args[]){
    movePath(3,3);
  }
  
  public static int movePath(int x, int y){
    System.out.print("("+x+","+y+") ");
    if(x==0&&y==0) {
      System.out.print("\n");
      return 0;
    }
    else if(x==0) {
      if(y==1) return 1;
      return movePath(0,y-1);
    }
    else if(y==0) {
      if(x==1) return 1;
      return movePath(x-1,0);
    }
    else{
      return movePath(x-1,y)+movePath(x,y-1);
    }
  }
}
