package com.stacks;

import java.util.Arrays;

public class MinStack {
	private int top = 0;
	int[] st = new int[4];
	public void push (int value) {
//		System.out.println(tsize);
		if (top == st.length) {
//			System.out.println(top);
			throw new StackOverflowError();
		}
		else {
			st[top++] = value;
			System.out.println(st[top-1]);
		}
	}
	public int peek() {
		if (top <= 0) 
			throw new IllegalStateException();
		return st[top-1];
	}
	public int pop() {
		if (top <= 0) 
			throw new IllegalStateException();
		top = top-1;
		return st[top];
	}
	public int minValue() {
		int min = st[0];
		for (int i=0; i<top; i++)
			if (st[i] < min) 
				min = st[i];
		return min;
	}
	public void printElements() {
		System.out.println();
		for (int i=0; i<top; i++)
			System.out.print(st[i]+" ");
	}
	
	@Override
	public String toString() {
		var con = Arrays.copyOfRange(st, 0, top);
		return Arrays.toString(con);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack obj = new MinStack();
		obj.push(5);
		obj.push(2);
		obj.push(10);
		obj.push(1);
		System.out.println("Minimum Value: "+ obj.minValue());
		System.out.println("Popped element: "+ obj.pop());
//		System.out.println("Peek value: " + obj.peek());
		obj.printElements();
		System.out.println("Minimum Value: "+ obj.minValue());
	}

}
