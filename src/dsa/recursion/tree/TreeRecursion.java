package dsa.recursion.tree;

public class TreeRecursion {
	
	private static void branch(int x) {
		// base case
		if(x >=5) {
			return ;
		}
		
		// logic
		System.out.print(x);
		
		// samll problem
		branch(x+1);
		branch(x+2);
		branch(x+3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		branch(0);

	}

}
