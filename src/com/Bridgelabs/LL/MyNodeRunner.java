package com.Bridgelabs.LL;



public class MyNodeRunner {
	public static void main(String[] args) {

		
		MyStack<Integer> myStack= new MyStack<Integer>();
		MyNode<Integer> frst= new MyNode<Integer>(50);
		MyNode<Integer> sec= new MyNode<Integer>(30);
		MyNode<Integer> third= new MyNode<Integer>(20);
		
		myStack.push(frst);
		myStack.push(sec);
		myStack.push(third);
		myStack.pop();
		myStack.print();
		
		
		
		
	}
}
