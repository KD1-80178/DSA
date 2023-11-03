package com.sunbeam;

public class List {
	private class Node
	{
		private int data;
		private Node next;
		
		public Node(int data) 
		{
			this.data = data;
			this.next = null;
		}
		
	}
	private Node head;
	
	public List() 
	{
		this.head = null;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addNode(int data)
	{
		Node newnode = new Node(data);
		if(isEmpty())
		{
			head=newnode;
		}
		else
		{
			Node trav=head;
			while(trav.next!=null)
			{
				trav=trav.next;
			}
			trav.next=newnode;
		}
	}
	
	public void findMidNode() 
	{
		if(head==null)
		{
			System.out.println("List is empty.");
			return;
		}
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println("Middle Node Value :"+slow.data);
	}
	
	public void displayList()
	{
		Node trav=head;
		System.out.println("List :");
		while(trav!=null)
		{
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
		System.out.println();
	}
	

}
