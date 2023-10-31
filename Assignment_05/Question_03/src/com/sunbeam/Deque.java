package com.sunbeam;

public class Deque {
	List l1;

	public Deque() {
		this.l1 = new List();
	}
	
	public boolean isEmpty()
	{
		return l1.isEmpty();
	}
	
	public void addFirst(int data)
	{
		l1.addFirst(data);
	}
	
	public void addLast(int data)
	{
		l1.addLast(data);
	}
	
	public void pop()
	{
		l1.deleteFirst();
	}
	
	public int peek()
	{
		return l1.getData();
	}
	
	public void display()
	{
		l1.Display();
	}

}
