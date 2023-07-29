class Solution {
    public int lastStoneWeight(int[] arr) {
        
        PriorityQueue<Integer>  maxHeap = new PriorityQueue<>((a,b) -> b-a);
        for(int i:arr){
            maxHeap.add(i);
        }

        while(maxHeap.size()>1){
            int x1 = maxHeap.poll();
            int x2 = maxHeap.poll();

            int difference = x1 - x2;
            maxHeap.add(difference);
        }
        
        return maxHeap.poll();
    }
}
