package com.sunbeam;

public class List {
	class Node
	{
		private int data;
		private Node next;
		private Node prev;
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	private Node head;
	private Node tail;
	
	public List() {
		this.head = null;
		this.tail = null;
	}
	
	public boolean isEmpty()
	{
		return head==null && tail==null;
	}
	
	public void addFirst(int data)
	{
		Node nn=new Node(data);
		if(isEmpty())
		{
			head=tail=nn;
		}
		else
		{
			nn.next=head;
			head.prev=nn;
			head=nn;
		}
	}
	
	public void addLast(int data)
	{
		Node nn=new Node(data);
		if(isEmpty())
			head=tail=nn;
		else
		{
			nn.prev=tail;
			tail.next=nn;
			tail=nn;
		}
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
			return;
		else if(head.next==head)
			head=tail=null;
		else
		{
			head=head.next;
			head.prev=null;
		}
			
	}
	
	public void Display() {
		Node trav = head;
		System.out.print("Forward : ");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	
	public int getData()
	{
		return head.data;
	}
	
	

}
