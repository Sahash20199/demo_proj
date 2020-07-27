package com.linkedlist;
import java.util.LinkedList;
public class LinkedListLoopAndMiddleNode {
	Node head ;
	class Node {
		int value;
		Node next;
		public Node (int value) {
			this.value = value;
			next = null;
		}
	}
	public void addLast(int num) {
		Node new_node = new Node(num); 
		if (head == null) {
	    	head = new Node(num);
			return;
		}
		new_node.next = null;
		Node last = head;
		while (last.next != null) 
			last = last.next;
		last.next = new_node;
		return;
	} 
	public void printList () {
		Node tnode = head;
		System.out.println("Elements in list are: ");
		while (tnode!=null) {
			System.out.print(tnode.value+ " ");
			tnode = tnode.next;
		}
	}
	
	public int loop () {
		Node fnode = head;
		Node lnode = head;
		
		while(fnode!=null && lnode!=null && lnode.next!=null)
	    {
	       fnode = fnode.next;
	       lnode = lnode.next.next;
	       if (fnode == lnode)
	           return 1;
	    }
		return 0;
	}
	
	public int size() {
		int count = 0;
		Node tnode = head;
		while (tnode != null) {
			count+=1;
			tnode = tnode.next;
		}
		return count;
	}
	public void middleNode(int msize,int tsize) {
		int count = 0;
		Node tnode = head;
		while (tnode != null) {
			count += 1;
			if (tsize%2 == 0) {
				if (count == msize) 
					System.out.print(tnode.value + " ");
				if (count == msize+1) 
					System.out.print(tnode.value + " ");
			}
			else {
				if (count == msize+1) 	
					System.out.print(tnode.value + " ");
			}
			tnode = tnode.next;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListLoopAndMiddleNode list = new LinkedListLoopAndMiddleNode();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.printList();
		System.out.println("\nLoop available? "+ list.loop());	
		int siz = list.size();
		System.out.println();
		System.out.println("Length of list: "+siz);
		int midsize = siz/2;
		System.out.println("Middle elements in list: ");
		list.middleNode(midsize, siz);
	}
}

