package com.sunbeam;

public class Question_06 {

	public static void main(String[] args) {
		BubbleSort l1=new BubbleSort();
		l1.addNode(40);
		l1.addNode(50);
		l1.addNode(20);
		l1.addNode(10);
		l1.addNode(30);
		l1.addNode(60);
		
		System.out.println("Original list");
		l1.display();
		l1.bubbleSort();
		
		System.out.println("Sorted list:");
		l1.display();

	}

}
