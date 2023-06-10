package dsa.recursion.array;

// code to print that array is sorted or not.

public class SortedArray {
	
	private static boolean isSortedArray(int arr[], int index) {
		
		// base case
		if(arr.length - 1  == index) {
			return true;
		}
		
		// buisness logic
		if(arr[index] > arr[index+1]) {
			return false;
		}
		
		// small problem
		return isSortedArray(arr, index+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 30, 40, 50};
		
		System.out.println(isSortedArray(arr, 0));
	}

}
