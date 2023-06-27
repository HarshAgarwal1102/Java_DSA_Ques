package dsa.recursion;

public class Test {
	public static int fun(int n) { 
		if(n<0){
		return 0;
		}

		if(n==1 || n==2 || n==3){
		return n;
		}
		return fun(n-1) + fun(n-2);
		}

		public static void main(String args[]) { 
			System.out.println(fun(7));
		}
}
