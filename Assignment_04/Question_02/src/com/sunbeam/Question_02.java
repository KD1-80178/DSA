package com.sunbeam;

public class Question_02 {

	public static void main(String[] args) {
		List l1 = new List();

		l1.addFirst('A');
		l1.addFirst('T');
		l1.addFirst('I');
		l1.addFirst('D');
		l1.addFirst('E');
		l1.addFirst('V');
		l1.addFirst('I');
		l1.addFirst('N');
		l1.addFirst('M');
		System.out.println("added first..");
		System.out.println();

		
		l1.addLast('S');
		l1.addLast('H');
		l1.addLast('I');
		l1.addLast('T');
		l1.addLast('A');
		l1.addLast('L');
		l1.addLast('3');
		System.out.println("added last....");
		System.out.println();

		l1.addPosition('@', 10);
		System.out.println("added at position...");
		System.out.println();

		
		l1.deleteFirst();
		System.out.println("deleted first..");
		System.out.println();

		l1.deletePosition(10);
		System.out.println("deleted at position..");
		System.out.println();

		l1.deleteLast();
		System.out.println("deleted at last..");
		System.out.println();
		l1.displayList();

	}

}
