class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) { 
        //Min Max Heap Technique
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        for(int i : nums1){
            minHeap.offer(i);
            maxHeap.offer(minHeap.poll());
            if(maxHeap.size() > minHeap.size()){
                minHeap.offer(maxHeap.poll());
            }
        }
        
        for(int i : nums2){
            minHeap.offer(i);
            maxHeap.offer(minHeap.poll());
            if(maxHeap.size() > minHeap.size()){
                minHeap.offer(maxHeap.poll());
            }
        }
        
        if(minHeap.size() > maxHeap.size()){
            return (double) minHeap.peek();
        }
        else{
            return (double) (minHeap.peek()+maxHeap.peek())/2.0;
        }
    }   
}
