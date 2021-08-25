package com.Bridgelabs.LL;

public class MyNodeRunner {
	public static void main(String[] args) {

		MyStack<Integer> myStack = new MyStack<Integer>();
		MyNode<Integer> frst = new MyNode<Integer>(50);
		MyNode<Integer> sec = new MyNode<Integer>(30);
		MyNode<Integer> third = new MyNode<Integer>(20);

		myStack.push(frst);
		myStack.push(sec);
		myStack.push(third);
		myStack.pop();
		myStack.print();

		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		MyNode<Integer> frstQ = new MyNode<Integer>(50);
		MyNode<Integer> secQ = new MyNode<Integer>(30);
		MyNode<Integer> thirdQ = new MyNode<Integer>(20);
		myQueue.enqueue(frstQ);
		myQueue.enqueue(secQ);
		myQueue.enqueue(thirdQ);
		myQueue.print();

	}
}
