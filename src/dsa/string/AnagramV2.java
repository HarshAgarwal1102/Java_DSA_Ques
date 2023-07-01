package dsa.string;

import java.util.Arrays;

public class AnagramV2 {
	
	public static boolean check(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		
		char[] a = s1.toCharArray();
		Arrays.sort(a);
		s1 = String.copyValueOf(a);
		
		char[] b = s2.toCharArray();
		Arrays.sort(b);
		s2 = String.copyValueOf(b);
		
		return s1.equals(s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check("silent", "listen"));
	}

}
