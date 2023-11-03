package com.sunbeam;

public class Question_08 {

	public static void main(String[] args) {
		Insert insert=new Insert();
		insert.insertSorted(80);
		insert.insertSorted(70);
		insert.insertSorted(60);
		insert.insertSorted(50);
		insert.insertSorted(10);
		insert.insertSorted(30);
		insert.insertSorted(20);
		insert.insertSorted(40);
		
		System.out.println("Inserted list :");
		insert.display();

	}

}
