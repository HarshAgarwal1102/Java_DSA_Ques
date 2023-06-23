package dsa.array.assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class NthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter the elements of the array :");
		for(int i = 0; i< arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		Arrays.sort(arr);
		
		System.out.println("Nth Largest Element in the array is: "+(arr[arr.length-1]));
	}

}
