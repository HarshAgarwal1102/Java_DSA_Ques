package dsa.recursion.array;

import java.util.ArrayList;

public class Permutation {
	
	private static ArrayList<String> getPerm(String str){
		// base case
		if(str.length() == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}
		
		char firstChar = str.charAt(0);
		ArrayList<String> result = new ArrayList<>();
		// small problem
		ArrayList<String> list = getPerm(str.substring(1));
		
		// logic
		for(String s : list) {
			for(int i = 0; i<= s.length(); i++) {
				StringBuilder sb = new StringBuilder(s);
				sb.insert(i, firstChar);
				result.add(sb.toString());
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = getPerm("abc");
		System.out.println(list);

	}

}
