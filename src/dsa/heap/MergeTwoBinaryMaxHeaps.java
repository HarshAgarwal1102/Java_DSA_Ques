class Solution{
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        int[]arr = new int[n+m];
        int i=0;
        
        for(int e:a)
            arr[i++]=e;
        for(int e:b)
            arr[i++]=e;
            
        int size = arr.length;
            
        for(int j=size/2-1;j>=0;j--){
            heapify(arr,j,size);
        }
        
        return arr;
    }
    
    public void heapify(int[]arr, int i, int n){
        int max = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<n && arr[left]>=arr[max])
            max = left;
        if(right<n && arr[right]>=arr[max])
            max = right;
        if(max!=i){
            arr[max]+=arr[i]-(arr[i]=arr[max]);
            heapify(arr,max,n);
        }
    }
}
