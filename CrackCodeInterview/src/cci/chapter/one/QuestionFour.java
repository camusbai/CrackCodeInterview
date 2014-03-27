package cci.chapter.one;

import java.security.InvalidParameterException;

public class QuestionFour {

	public static void main(String[] args) {
		char[] input = "Mr John Smith    ".toCharArray();
		int length = 13;
		System.out.println(input[0]);
		System.out.println(replaceSpace(input,length));
		//System.out.println(moveStr(input,3,4));

	}

	//warning: parameter 'length' is not used at all here
	public static char[] replaceSpace(char[] input, int length) {
		for(int i=0;i<input.length;++i){
			if(input[i]==' '){
				moveStr(input,i+1,2);
				input[i]='%';
				input[i+1]='2';
				input[i+2]='0';
			}
		}
		return input;
	}

	public static char[] moveStr(char[] input, int start, int steps) {
		if (steps > 0 && start > -1 && start < input.length) {
			int index = input.length-1;
			int flag;
			for (flag = 0; flag < steps; ++flag) {
				if(input[index-flag]!=' ')
					throw new InvalidParameterException("Steps required to move is more than spaces trailing in the string");
			}
			for(int i = index-flag; i>=start; --i){
				input[i+steps] = input[i];
			}

			return input;
		} else {
			throw new InvalidParameterException();
		}
	}

}
