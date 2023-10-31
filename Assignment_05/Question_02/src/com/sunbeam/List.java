package com.sunbeam;

import com.sunbeam.List.Node;

public class List {
	public class Node
	{
		private int data;
		private Node prev;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
	private Node head;
	
	public List() {
		this.head = null;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int data)
	{
		Node nn=new Node(data);
		if(isEmpty())
		{
			head=nn;
			head.next=head;
			head.prev=head;
		}
		
		else
		{
			nn.next=head;
			nn.prev=head.prev;
			head.prev.next=nn;
			head.prev=nn;
			head=nn;
		}
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
			return;
		else if(head.next==head)
			head=null;
		else
		{
			head.prev.next=head.next;
			head.next.prev=head.prev;
			head=head.next;
		}
	}
	
	public int getData()
	{
		return head.data;
	}
	
	public void display()
	{
		if(isEmpty())
			return;
		Node trav=head;
		System.out.println("List :");
		do {
			System.out.print(" "+trav.data);
			trav=trav.next;
		}while(trav!=head);
		System.out.println(" ");
	}
	

}
