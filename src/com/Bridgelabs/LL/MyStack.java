package com.Bridgelabs.LL;

public class MyStack<K> {

	private MyLinkedList ll;

	private INode head;
	private INode tail;

	public MyStack() {
		ll = new MyLinkedList();
	}

	public void pop() {
		ll.deleteLastElement();
	}

	public void peek() {
		System.out.println(ll.head.getkey());
	}

	public void push(INode<K> element) {
		ll.add(element);
	}

	public void print() {
		ll.print();
	}
}
