package dsa.recursion.array;

public class SubSequenceVoid {
	
	private static void subSequence(String str, String result) {
		
		// base case
		if(str.length() == 0) {
			System.out.println(result);
			return;
		}
		
		char firstChar = str.charAt(0);
		subSequence(str.substring(1), result); // not include
		subSequence(str.substring(1), result+firstChar);  // include 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subSequence("abcd", " ");
	}

}
