package dsa.recursion.assignment2.patterns;

/*
*********
 *     *
  *   *
   * *
    *
 */

public class Pattern16 {

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

	private static void printStar(int row, int col, int n) {
		
		// base case
		if(col == ((2*n) -(2*row -1))) {
			//System.out.println();
			return;
		}
		
		// buisness logic
		if(row==1 || col ==0 || col == (((2*n) -(2*row -1)) -1)) {
			System.out.print("*");
		}
		else
			System.out.print(" ");
		
		
		
		// small problem
		printStar(row, col+1, n);
		
	}

	private static void printLine(int row, int col, int n, int s) {
		// base case
		if(row == 0)
			return ;
		
		// buisness logic
		printSpace(s);
		printStar(row, col, n);
		System.out.println();
		
		
		// small problem
		printLine(row+1, col, n, s+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printLine(1, 0, 5, 0);
	}

}
