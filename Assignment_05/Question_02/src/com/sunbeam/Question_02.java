package com.sunbeam;

public class Question_02 {
	

	public static void main(String[] args) {
		
		Stack s=new Stack();
		
		s.push(10);
		s.push(12);
		s.push(25);
		s.push(35);
		s.push(2);
		s.display();
		
		s.pop();	
		s.display();
		
		System.out.println("Top element = "+s.peek());
		
		
	}

}
