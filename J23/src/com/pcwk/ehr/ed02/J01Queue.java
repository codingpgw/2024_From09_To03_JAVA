package com.pcwk.ehr.ed02;

import java.util.LinkedList;
import java.util.Queue;

public class J01Queue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(18);
		queue.add(15);
		queue.add(13);
		queue.offer(10);
		queue.offer(17);
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}

}
