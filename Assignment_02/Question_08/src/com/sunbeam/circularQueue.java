package com.sunbeam;

public class circularQueue 
{
	private int arr[];
	private int rear , front;
	private int SIZE;
	int counter;
	public circularQueue(int Size) {
		
		SIZE = Size;
		arr=new int[Size];
		front =-1;
		rear=-1;
		counter=0;
	}
	
	public void push(int data)
	{
		counter++;
		rear=(rear+1) % SIZE;
		arr[rear]=data;
	}
	
	public void pop()
	{
		counter--;
		front=(front+1)%SIZE;
		if(front==rear)
			front=rear=-1;
	}
	
	public int peek()
	{
		return arr[front+1];
	}
	
	public boolean isFull()
	{
		return counter==SIZE;
	}
	
	public boolean isEmpty()
	{
		return counter==0;
	}
	
}
