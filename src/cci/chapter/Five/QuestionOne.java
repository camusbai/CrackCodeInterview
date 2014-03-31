package cci.chapter.Five;

/**
 * Insert M into N in binary starting from position j to i
 */
public class QuestionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rslt = insert(5,32,4,2);
		
	}
	
	//current solution is based on assumption that j-i+1 is exactly the length of m in binary
	private static int insert(int m, int n, int j, int i){
		int mask = ~((int) (Math.pow(2, j-i+1)-1)<<i);
		int rslt = (n&mask)+(m<<i);
//		System.out.println(Integer.toBinaryString(mask));
//		System.out.println(Integer.toBinaryString(n|mask));
//		System.out.println(Integer.toBinaryString(~255));
		System.out.println("n: "+Integer.toBinaryString(n)+"\nm: "+Integer.toBinaryString(m)+"\nposition: j "+j+",i "+i+"\nAfter insertion: "+Integer.toBinaryString(rslt));
		return rslt;
	}

}
