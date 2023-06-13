package dsa.recursion.assignment2.patterns;

/*
 1
 2 3
 4 5 6
 7 8 9 10
 */

public class Pattern14 {
	private static int printNum(int num, int col) {
		if(col == 0) {
			return  num;
		}
		System.out.print(num+" ");
		return printNum(num+1, col-1);
	}
	
	private static void numberPattern (int n, int num, int col) {
		// base case
		if(n == 0) {
			return;
		}
		
		// logic
		num = printNum(num, col);
		
		System.out.println();
		
		
		// small prioblem 
		numberPattern(n-1, num, col+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberPattern(4, 1, 1);
	}

}
