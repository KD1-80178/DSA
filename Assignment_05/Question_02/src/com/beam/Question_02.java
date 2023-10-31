package com.beam;

public class Question_02 {

	public static void main(String[] args) {
		Queue q=new Queue();
		
		q.push(15);
		q.push(21);
		q.push(45);
		q.push(56);
		q.push(10);
		q.display();
		
		q.pop();
		q.display();
		
		System.out.println("Top element = "+q.peek());
		

	}

}
