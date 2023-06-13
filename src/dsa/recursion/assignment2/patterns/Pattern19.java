package dsa.recursion.assignment2.patterns;

public class Pattern19 {
	
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


private static void printStar(int star) {
	
	// base case
	if(star == 0)
		return;
	
	// buisness logic
	System.out.print("*");
	
	
	// small problem
	printStar(star-1);

}

private static void printLine(int row, int stars) {
	// base case
	if(row == 0)
		return ;
	
	// buisness logic
	printSpace(row-1);
	printStar(2*stars - 1);
	printSpace(row+1);
	printSpace(row-1);
	printStar(2*stars - 1);
	System.out.println();
	
	
	// small problem
	printLine(row-1, stars+1);
	
}
private static void printLower(int row, int stars) {
	// base case
	if(row == 0)
		return ;
	
	// small problem
	printLower(row-1, stars+1);
		
	// buisness logic
	printSpace(row-1);
	printStar(2*stars - 1);
	System.out.println();
	
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	// two approaches
	
	int row = 3;
	int col = 3;
	
	// stack building
	printLine(row, col);
	printLower(10,1);

}
}
