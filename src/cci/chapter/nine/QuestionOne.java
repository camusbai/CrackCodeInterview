package cci.chapter.nine;

public class QuestionOne {

  public static void main(String[] args) {
    int steps = stepCombo(5);
    System.out.println(steps);

  }
  
  public static int stepCombo(int stairs){
    if(stairs==0) return 0;
    else if(stairs==1) return 1;
    else if(stairs==2) return 2;
    else if(stairs==3) return 4;
    else
      return stepCombo(stairs-1)+stepCombo(stairs-2)+stepCombo(stairs-3);
  }

}
