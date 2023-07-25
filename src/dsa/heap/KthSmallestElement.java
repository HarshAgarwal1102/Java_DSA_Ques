class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=l;i<=r;i++)
        {
            pq.offer(arr[i]);
            if(pq.size()>k)
            pq.remove();
        }
        return pq.poll();
    } 
}
