import java.util.Collections;
import java.util.PriorityQueue;

public class Median {

	public static double findMedian(int arr[]) { 
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	
	for(int i=0; i<arr.length; i++) { 
		if(maxHeap.isEmpty() || maxHeap.peek() >= arr[i])
			maxHeap.add(arr[i]);

		else
			minHeap.add(arr[i]);

		if(maxHeap.size()>minHeap.size()+1) 
			minHeap.add(maxHeap.poll());

		else if(maxHeap.size() < minHeap.size())
			maxHeap.add(minHeap.poll());
	}
	if (maxHeap.size() == minHeap.size()){ 
		return (maxHeap.peek()+ minHeap.peek()) / 2.0;
	}
	else
		return maxHeap.peek();
}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5}; 
		System.out.println(findMedian (arr));
	}
}
