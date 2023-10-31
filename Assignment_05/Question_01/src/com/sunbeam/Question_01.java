package com.sunbeam;

public class Question_01 {

	public static void main(String[] args) {
		List l1=new List();
		
		l1.addFirst(15);
		
		l1.addFirst(2);
		
		l1.addFirst(30);
		
		l1.addFirst(35);
		l1.display();
		
		l1.addPosition(80,2);
		l1.display();
		
		l1.deletePosition(2);
		l1.display();
		

	}

}
