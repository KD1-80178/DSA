package com.sunbeam;

public class Question_03 {

	public static void main(String[] args) {
		Deque q=new Deque();
		
		q.addFirst(10);
		q.addFirst(15);
		q.addFirst(22);
		q.addFirst(9);
		q.addFirst(1);
		q.addFirst(8);
		q.addLast(80);
		q.addFirst(11);
		q.display();
		
		q.pop();
		q.pop();
		q.display();
		
		System.out.println("Top element = "+q.peek());

		

	}

}
