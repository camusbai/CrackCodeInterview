package cci.chapter.one;

import java.util.HashMap;
import java.util.Map;

public class QuestionThree {

	public static void main(String[] args) {
		String inputA = "rcseer";
		String inputB = "serre";
		System.out.println("Input A:" + inputA + "\nInput B:" + inputB + "\n");
		System.out.println(isPermutation(inputA, inputB));
	}

	public static boolean isPermutation(String strA, String strB) {
		if (strA.length() == strB.length() && !strA.isEmpty()
				&& !strB.isEmpty()) {
			Map<Character, Integer> mp = new HashMap<>();
			for (char c : strA.toCharArray()) {
				if (!mp.containsKey(c)) {
					mp.put(c, 1);
				} else {
					int tmp = mp.get(c).intValue();
					mp.put(c, ++tmp);
				}
			}

			for (char c : strB.toCharArray()) {
				if (mp.containsKey(c) && mp.get(c).intValue() > 0) {
					mp.put(c, Integer.valueOf(mp.get(c).intValue() - 1));
				} else {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

}
