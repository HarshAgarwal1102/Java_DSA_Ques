import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KMostOccuringElements {
	static void mostOccured (int []arr, int k){
		Map<Integer, Integer> hashmap = new HashMap<>();
		for(int i:arr) { 
			hashmap.put(i, hashmap.getOrDefault(i, 0) +1);
		}
		PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b) ->b.getValue() - a.getValue());
		maxHeap.addAll(hashmap.entrySet());
		for(int i=0;i<k;i++){
			System.out.println(maxHeap.poll().getKey());
		}
		return;
	}
	
		public static void main(String[] args) {
			int arr[] = {1,1,1,1,2,2,3,3,3,3,4,4,4,4,4};
			mostOccured (arr, 3);
		}
}
