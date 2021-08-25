package com.Bridgelabs.LL;

public class MyQueue<K> {
	private MyLinkedList ll;

	public MyQueue() {
		ll = new MyLinkedList();
	}

	public void enqueue(INode<K> element) {
		ll.append(element);
	}

	public void Dequeue(INode<K> element) {
		ll.deleteLastElement();
	}
	public void print ()
	{
		ll.print();
	}

}
