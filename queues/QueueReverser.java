package com.queues;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
	public  static void reverse(Queue<Integer> queue, int val) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i=0; i<val; i++) {
			stack.push(queue.remove());
		}
		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		for (int i = 0; i < queue.size() - val; i++) 
            queue.add(queue.remove()); 
		
		
	}

	@Override
	public String toString() {
		return "ReverseQueue [toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new ArrayDeque();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);	queue.add(50);	queue.add(60);	queue.add(70);
		int val = 3;
		reverse(queue,val);
		System.out.println(queue.toString());
	}
}
