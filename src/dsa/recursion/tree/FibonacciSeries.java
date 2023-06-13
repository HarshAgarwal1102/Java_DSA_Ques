package dsa.recursion.tree;

public class FibonacciSeries {
	
	private static int fib(int n) {
		// base case
		if(n < 2) {
			return n;
		}
		
		// small problem 
		return fib(n-1) + fib(n-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(5));
	}

}
