package com.sunbeam;

public class List {
	public class Node
	{
		private char data;
		private Node next;
		
		public Node(char value) {
			this.data = value;
			this.next = null;
		}
		
	}
	private Node tail;
	private int count;
	
	public List() {
		tail = null;
		count = 0;
	}

	public int getCount() {
		return count;
	}
	
	public boolean isEmpty()
	{
		return tail==null;
	}
	
	public void addFirst(char value)
	{
		Node newnode=new Node(value);
		if(isEmpty())
		{
			tail=newnode;
			tail.next=tail;
		}
		else
		{
			newnode.next=tail.next;
			tail.next=newnode;
			
		}
		count++;
		System.out.println("value added...");
	}
	
	public void displayList()
	{
		if(isEmpty())
			return;
		System.out.println("List = ");
		Node trav=tail.next;
		do
		{
			System.out.print(" "+trav.data);
			trav=trav.next;
		}while(trav!=tail.next);
		System.out.println("");
	}
	

}
