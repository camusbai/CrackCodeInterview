package cci.chapter.five;

public class BinaryUtility {
	public static int countOne(int positive){
	  /*
	  Alternative solution
		int cnt = 0;
		while(positive!=0){
		 if((positive&1)==1)
		   ++cnt;
		 positive>>=1;
		}
		*/
	  int cnt = 0;
	  while(positive!=0){
	    positive = positive&(positive-1);
	    ++cnt;
	  }
		return cnt;
	}
}
