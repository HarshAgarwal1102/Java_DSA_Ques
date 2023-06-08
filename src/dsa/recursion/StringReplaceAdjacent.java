package dsa.recursion;
// Given a String find the adjacent element if it is same as the previous element so replace the element with #.
//e.g "aabbcc" 
// output a#b#c#
public class StringReplaceAdjacent {
	
	private static String replace(String str, String a, int i) {
		
		// base case
		if(str.length() - 1  == i) {
			return str ;
		}
		
		// buisness logic
		if(str.charAt(i) == str.charAt(i+1)) {
			
		}
		
		// small problem
		replace(str, a, i+1);
		
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabbcc";

		replace(str, "#", 0);
	}

}
