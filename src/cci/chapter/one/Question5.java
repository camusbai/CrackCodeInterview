package cci.chapter.one;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class Question5 {

	public static void main(String[] args) {
		final String input = "\ndddddddddddoub\nbbble";
		//System.out.println(input);
		System.out.println(StringCompress(input));
		

	}
	
	//below one is expensive in space and constructing objects
	public static String StringCompress(String input){
		List<Entry<String,Integer>> compression = new ArrayList<Entry<String, Integer>>();
		char previous = '\n';
		if(input.charAt(0)=='\n'){
			previous = 'a';
		}		
		//System.out.println(input.length());
		if(input.length()<1) return input;
		for(char c : input.toCharArray()){
			if(c!=previous){
				previous = c;
				Entry<String,Integer> record = new AbstractMap.SimpleEntry<String,Integer>(Character.toString(c),1);
				compression.add(record);
			}
			else{
				Entry<String,Integer> existRecord = compression.get(compression.size()-1);
				existRecord.setValue(existRecord.getValue()+1);
			}
		}
		StringBuilder result = new StringBuilder();
		for(Entry<String,Integer> record : compression){
			result.append(record.getKey()+record.getValue());
		}
		if (result.length()>input.length())
			return input;
		else
			return result.toString();
	}
	
	public static int countCompression(String input){
		if(input.isEmpty()) return 0;
		char lastChar = input.charAt(0);
		int count = 0;
		int individualCount = 0;
		for (char c : input.toCharArray()){
			if(c!=lastChar) {
				count=1+String.valueOf(individualCount).length();
				lastChar = c;
				individualCount = 0;
			}
			else{
				individualCount++;
			}
		}
		return count;
	}

}
