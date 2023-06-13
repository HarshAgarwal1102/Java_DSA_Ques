package dsa.recursion.assignment2.patterns;

/*

* 
**
***
****
*****
****
***
**
*

*/

public class Pattern12 {


private static void printStar(int star) {
	
	// base case
	if(star == 0)
		return;
	
	// buisness logic
	System.out.print("*");
	
	
	// small problem
	printStar(star-1);

}

private static void printLine(int row, int star, int n) {
	// base case
	if(row == 0)
		return ;
	
	// buisness logic
	printStar(star +1);
	System.out.println();
	
	
	// small problem
	
	printLine((row)-1, star+1, n);
	
	if(row == n) {
		return;
	}

		System.out.print("*");
		printStar(star - 1);
		System.out.println();
		
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	// two approaches
	
	int row = 4;
	int star = 0;
	int n = row;
	
	// stack building
	printLine(row, star, n);


}
}

