package com.sunbeam;

public class Queue {
	private int arr[];
	private int rear , front;
	private int SIZE;
	public Queue(int Size) {
		
		SIZE = Size;
		arr=new int[Size];
		front =0;
		rear=0;
	}
	
	public void push(int data)
	{
		rear++;
		arr[rear]=data;
	}
	
	public void pop()
	{
		front++;
	}
	
	public int peek()
	{
		return arr[front+1];
	}
	
	public boolean isFull()
	{
		return rear==SIZE-1;
	}
	
	public boolean isEmpty()
	{
		return front==rear;
	}
	
}
