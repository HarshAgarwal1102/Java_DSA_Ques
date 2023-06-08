package dsa.recursion;

public class ReverseString {
	
	private static String reverse(String str) {
		
		// base case
		if(str.length() == 1) {
			return str;
		}
		
		// small problem
		String smallResult = reverse(str.substring(1));
		char firstChar = str.charAt(0);
		// buisness logic
		return smallResult + firstChar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Harsh";
		System.out.println(reverse(name));
		
	}
}
