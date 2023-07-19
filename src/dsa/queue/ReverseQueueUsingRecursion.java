package dsa.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueUsingRecursion {
	
	//Without using extra space
    static void reverseQueue2(Queue<Integer> queue ){
        if(queue.isEmpty()){
            return;
        }
        int front = queue.poll();
        reverseQueue2(queue);
        queue.offer(front);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
	       queue.add(10);
	       queue.add(20);
	       queue.add(30);
	       queue.add(40);
	        System.out.println("Original Queue  : " + queue);
	        reverseQueue2(queue);
	        System.out.println("Reversed Queue : " + queue);
	}

}
