package com.sunbeam;

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
		return head==null ;
	}
	
	public void addFirst(int value)
	{
		Node nn=new Node(value);
		if(isEmpty())
		{
			head = nn;
			head.next=head;
			head.prev=head;
		}
		
		else
		{
			nn.prev=head.prev;
			nn.next=head;
			head.prev.next=nn;
			head.prev=nn;
			head=nn;
		}
	}
	
	public void addPosition(int data,int pos)
	{
		Node nn=new Node(data);
		if(isEmpty())
			head=nn;
		else 
		{
			Node trav=head;
			for (int i=1;i<pos-1;i++)
			{
				trav=trav.next;
			}
			nn.prev=trav;
			nn.next=trav.next;
			trav.next=nn;
			nn.next.prev=nn;
			
			
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
			head.next.prev=head.prev;
			head.prev.next=head.next;
			head=head.next;
			
		}
	}
	
	public void deletePosition(int pos)
	{
		if(isEmpty())
			return;
		else if(head.next==head)
			head=null;
		else {
			Node trav=head;
			for (int i=1;i<pos;i++)
			{
				trav=trav.next;
			}
			trav.prev.next=trav.next;
			trav.next.prev=trav.prev;
		}
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
