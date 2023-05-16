package com.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(10);
		stack.push(10.10);
		stack.push("tops");
		stack.push('t');
		stack.push(true);
		stack.push(null);
		stack.push(10);
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
	}
}
