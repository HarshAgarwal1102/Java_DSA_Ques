class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        long sum=0,ans=0;
        PriorityQueue<Long> pq = new PriorityQueue();
        for(int i=0; i<n; i++){
            pq.add(arr[i]);
        }
        while(pq.size()>1)
        {
            long first=pq.peek();
            pq.poll();
            long second=pq.peek();
            pq.poll();
            
            sum=first+second;
            ans+=sum;
            pq.add(sum);
        }
 
        return ans;
    }
}
