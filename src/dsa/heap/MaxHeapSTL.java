package dsa.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapSTL {
	public static void main(String[] args) {
        int arr[] = {6, 9, 14, 12, 15};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i :arr){
            minHeap.offer(i);
        }
        
        System.out.println(minHeap);
    }
}
