package com.sunbeam;

import java.util.Scanner;

public class Question_07 {

	public static void main(String[] args) {
		Queue q=new Queue(5);
		int choice;
		
		do
		{
			System.out.println("Enter the choice = ");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. peek");
			choice=new Scanner(System.in).nextInt();
			
			switch(choice)
			{
			case 1:
				if(q.isFull())
					System.out.println("Queue is full..");
				else
				{
					System.out.println("Enter the data to be pushed");
					int data=new Scanner(System.in).nextInt();
					q.push(data);
					System.out.println("Data is pushed");
				}
				break;
				
			case 2:
				if(q.isEmpty())
					System.out.println("Queue is Empty");
				else
					q.pop();
				System.out.println("data is deleted");
				break;
				
			case 3:
				if(q.isEmpty())
					System.out.println("Queue is Empty");
				else
				System.out.println("Peeked Data= "+q.peek());
				break;
			}
		}while(choice!=0);
		
		
	}

}
