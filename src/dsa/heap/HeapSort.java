class Solution
{
    //Function to build a Heap from array.
    void buildHeap(int arr[], int n)
    {
       for(int i=(n-1)/2;i>=0;i--){
           heapify(arr,n,i);
       }
       
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        int left=(2*i+1);
        int right=(2*i+2);
        int maxheap=i;
        
        if(left<n&&arr[left]>arr[maxheap]){
            maxheap=left;
        }
        if(right<n&&arr[right]>arr[maxheap]){
            maxheap=right;
        }
        if(maxheap!=i){
        int x=arr[i];
        arr[i]=arr[maxheap];
        arr[maxheap]=x;

        heapify(arr,n,maxheap);
        }
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
        buildHeap(arr,n);
        for(int i=n-1;i>=0;i--){
            int x=arr[0];
            arr[0]=arr[i];
            arr[i]=x;
            
            heapify(arr,i,0);
        }
    }
 }
