class Solution {
    public static int kthLargest(int N, int K, int[] Arr) {
        // code here
        PriorityQueue<Integer> pQ=new PriorityQueue<>();
        
        for(int i=0; i<Arr.length; i++){
            int sum=0;
            for(int j=i; j<Arr.length; j++){
                sum += Arr[j];
                
                if(pQ.size() < K){
                    pQ.add(sum);
                }
                else{
                    if(sum > pQ.peek()){
                        pQ.poll();
                        pQ.offer(sum);
                    }
                }
            }
        }
        return pQ.peek();
    }
}
