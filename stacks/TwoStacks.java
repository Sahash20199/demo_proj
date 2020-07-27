package com.stacks;

public class TwoStacks {
	private int st[],top1, top2, size;
	TwoStacks(int n) {
		st = new int[n];
		size = n;
		top1 = -1;
		top2 = size;
	}
	
	public void push1 (int value) {
		if (top1 >= top2-1) 
			throw new StackOverflowError();
		else {
			st[++top1] = value;
			System.out.println(st[top1]);
		}
	}
	public void push2 (int value) {
		if (top1 >= top2-1) 
			throw new StackOverflowError();
		else {
			st[--top2] = value;
			System.out.println(st[top2]);
		}
	}
	public int pop1() {
		if (top1 < 0) 
			throw new IllegalStateException();
		return st[top1--];
	}
	public int pop2() {
		if (top2 >= size) 
			throw new IllegalStateException();
		return st[top2++];
	}
	public int isEmpty1() {
		if (top1 < 0) 
			return 1;
		return 0;
	}
	public int isEmpty2() {
		if (top2 >= size) 
			return 1;
		return 0;
	}
	public int isFull1() {
		if (top1 >= top2-1) 
			return 1;
		return 0;
	}
	public int isFull2() {
		if (top1 >= top2-1) 
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStacks obj = new TwoStacks(5);
		obj.push1(5);
		obj.push2(2);
		obj.push1(4);
		obj.push2(1);	obj.push1(6); 	
		System.out.println("Popped element -1: "+ obj.pop1());
		System.out.println("Popped element -2: "+ obj.pop2());
		System.out.println("Popped element -2: "+ obj.pop2());
		System.out.println("Popped element -2: "+ obj.pop1());
		System.out.println("Popped element -2: "+ obj.pop1());
		System.out.println("Is stack full -1? " + obj.isFull1());
		System.out.println("Is stack full -2? " + obj.isFull2());
		System.out.println("Is stack empty-1? "+ obj.isEmpty1());
		System.out.println("Is stack empty-2? "+ obj.isEmpty2());
	}

}
