public class Solution {

    public static ArrayList<Integer> buildHeap(ArrayList<Integer> arr, int n) {
        for(int i=n/2 -1;i>=0;i--)
            heapifyAlgo(arr,n,i);

        return arr;
    }

    private static void heapifyAlgo(ArrayList<Integer> arr,int size,int index){

        int largest = index;
        int left = 2*index +1;
        int right = 2*index +2;

        if(left < size && arr.get(left) > arr.get(largest))
            largest = left;

        if(right < size && arr.get(right) > arr.get(largest))
            largest = right;

        if(largest != index){
            Collections.swap(arr,largest,index);
            heapifyAlgo(arr,size,largest);
        }
    }
}
