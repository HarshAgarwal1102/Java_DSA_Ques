package dsa.recursion.array;

import java.util.ArrayList;

public class SubSequence {
	
	public static ArrayList<String> occurences(String str){
		
		// base case
		if(str.length() == 0) {
			ArrayList<String> list = new ArrayList<String>();
			list.add("");
			return list;
		}
		
		
		// small problem
		char firstChar = str.charAt(0);
		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> list = occurences(str.substring(1));
		
		for(String i : list) {
			// not include
			result.add(i);
			
			// include
			result.add(firstChar + i);
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = occurences("harsh");
		System.out.println(list);
		
	}

}
