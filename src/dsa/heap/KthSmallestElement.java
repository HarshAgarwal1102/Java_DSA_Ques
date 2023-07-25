class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=l;i<k;i++)
        {
            pq.add(arr[i]);
        }
        for(int i=k;i<=r;i++)
        {
            if(arr[i] < pq.peek() ){
                pq.poll();
                pq.offer(arr[i]);
            }
        }
        return pq.peek();
    } 
}
