package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Code239_Queue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		Integer data = q.poll();
		System.out.println("you polled : " + data);
		
		q.add(60);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
