package dsa.recursion.assignment2.patterns;

public class Pattern20 {
	private static void printSpace(int row) {
		
		// base case
		if(row == 0) {
			return ;
		}
		
		// logic
		System.out.print(" ");
		
		// small problem
		printSpace(row-1);
		
	}

	private static int printNum(int num, int col) {
		if(col == 0) {
			return  1;
		}
		System.out.print(num);
		return printNum(num+1, col-1);
	}
	private static int printNumRev(int col) {
		if(col == 0) {
			return  -1;
		}
		System.out.print(col);
		return printNumRev(col-1);
	}
	
	private static void numberPattern (int rows, int n) {
		// base case
		if(rows > n) {
			return;
		}
		
		// logic
		printNum(1, rows);
		printSpace(2*(n-rows));
		printNumRev(rows);
		
		System.out.println();
		
		
		// small prioblem 
		numberPattern(rows+1, n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberPattern(1, 5);
	}

}
