public class Solution
{
	public static void heapify(int[] arr, int n, int i){
    	int smallest = i;

    	int leftIndex = 2*i + 1;
    	int rightIndex = 2*i + 2;

    	if(leftIndex < n && arr[smallest] > arr[leftIndex]){
        	smallest = leftIndex;
    	}
    	if(rightIndex < n && arr[smallest] > arr[rightIndex]){
        	smallest = rightIndex;
    	}

    	if(smallest != i){
        	int temp = arr[smallest];
			arr[smallest] =  arr[i];
			arr[i] = temp;
        	heapify(arr, n, smallest);
    	}
	}
	public static int[] buildMinHeap(int[] arr)
	{
		// Write your code here
		int n = arr.length;
    	for(int i = n/2 - 1; i>=0; i--){
        	heapify(arr, n, i);
    	}
    	return arr;
	}
}
