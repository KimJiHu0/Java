package com.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("hi");
		queue.offer("bye");
		queue.offer("who");
		
		System.out.println(queue);
		
		//가장 먼저 집어넣은 것들 리턴하고 삭제 x
		System.out.println(queue.peek());
		
		System.out.println(queue);
		
		//가장 먼저 집어넣을 것을 리턴하고 삭제o
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
	}

}
