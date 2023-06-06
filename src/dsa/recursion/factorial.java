package dsa.recursion;

public class factorial {
	
	private static void fact(int num, int result) {
		// termination case
		if(num == 0 || num == 1) {
			System.out.println(result);
			return ;
		}
		
		// buisness logic
		result = num * result;
		
		// small problem 
		fact((num-1), result);
	}
	
	private static int fact(int num) {
		// termination case
		if(num == 0 || num == 1) 
			return 1;
		
		// small problem 
		int result = fact(num-1);
		
		// buisness logic
		num = num * result;
		return num;
		
		// here small problem and buisness logic can be combined together also.
		// return (num * fact(num-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// two approaches
		
		//stack building
		fact(5, 1);
		
		// stack falling
		int result = fact(5);
		System.out.println(result);
	}

}
