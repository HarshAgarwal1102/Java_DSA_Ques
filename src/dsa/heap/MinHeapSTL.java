package dsa.heap;

import java.util.PriorityQueue;

public class MinHeapSTL {
    
    public static void main(String[] args) {
        int arr[] = {14, 6, 9, 12, 15};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i :arr){
            minHeap.offer(i);
        }
        
        System.out.println(minHeap);
    }
}
