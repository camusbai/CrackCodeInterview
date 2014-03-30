package cci.chapter.one;

import java.util.HashMap;
import java.util.Map;

public class QuestionOne {

	public static void main(String[] args) {
		String input = "asa";
		System.out.println("input: " + input);
		System.out.println(isUniqueByMap(input));
		System.out.println(isUniqueIterate(input));
	}

	public static boolean isUniqueByMap(String input) {
		Map<Character, Number> mp = new HashMap<>();
		for (char c : input.toCharArray()) {
			if (mp.containsKey(c)) {
				return false;
			} else {
				mp.put(c, 1);
			}
		}
		return true;
	}

	public static boolean isUniqueIterate(String input) {
		for (int i = 0; i < input.length(); ++i) {
			for (int j = i + 1; j < input.length(); ++j) {
				if (input.charAt(i) == input.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

}
