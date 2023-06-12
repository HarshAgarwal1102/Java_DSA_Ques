package dsa.recursion.array;

// 2489
// return sum of odd position and even position in an array.

public class OddEvenPositionSum {
	
	public static int[] sum(int num, int pos) {
		// base case
		if(num == 0) {
			int[] arr = new int[2];
			return arr;
		}
		
		
		
		// small problem
		int result[] = sum(num/10, pos+1);
		
		
		
		// buisness logic
		int digit = num%10;
		
		if(pos%2!=0) {
			// odd result
			result[0] = digit + result[0];
		}
		else
			// even result
			result[1] = digit + result[1];
		
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 2489;
		
		int arr[] = sum(num, 0);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}

}
