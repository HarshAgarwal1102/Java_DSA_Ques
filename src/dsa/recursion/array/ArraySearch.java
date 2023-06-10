package dsa.recursion.array;

// code to search that element is present or not in an array.

public class ArraySearch {
	
	private static boolean search(int arr[], int element, int index) {
		
		// base case
		if(arr.length == index) {
			return false;
		}

		// buisness logic
		if(arr[index] == element) {
			return true;
		}
		
		// small problem
		return search(arr, element, index+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 20, 30, 40, 50};
		System.out.println(search(arr, 50, 0));
	}

}
