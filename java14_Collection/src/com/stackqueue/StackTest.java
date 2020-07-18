package com.stackqueue;

import java.util.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		
		//후입선출
		Stack stack = new Stack();
		
		stack.push("hi");
		stack.push("bye");
		stack.push("who");
		
		System.out.println(stack);
		
		//마지막에 넣은 객체를 가져오지만 삭제되지 않음.
		System.out.println(stack.peek());
		System.out.println(stack);
		
		//마지막에 넣은 객체를 가져오고 배열에서 삭제.
		System.out.println(stack.pop());
		System.out.println(stack);
	}

}
