package dsa.recursion;

public class SumOfDigits {
	
	private static void sod(int num, int sum) {
		// termination case
		if(num == 0) {
			System.out.println(sum);
			return ;
		}
		
		// buisness logic
		int lastDigit = num % 10;
		sum = sum + lastDigit;
		
		// small problem 
		sod(num/10, sum); // tail resursion
	}
	
	private static int sod(int num) {
		// termination case
		if(num == 0) 
			return 0;
		
		// small problem
		int sum = sod(num/10);
		
		// buisness logic
		int n = num % 10;
		sum = sum + n;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// two approaches
		
		sod(123,0); // stack building
		
		int result = sod(123); // stack falling
		System.out.println(result);
	}

}
