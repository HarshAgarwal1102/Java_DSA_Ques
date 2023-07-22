class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	    Stack<Integer> s = new Stack<>();
	    s.push(-1);
	    int arr1[] = new int[n];
	    for(int i = n-1; i>=0; i--){
	        int curr = arr[i];
	        while(s.peek() >= curr){
	            s.pop();
	        }
	        arr1[i] = s.peek();
	        s.push(curr);
	    }
	    return arr1;
	} 
}
