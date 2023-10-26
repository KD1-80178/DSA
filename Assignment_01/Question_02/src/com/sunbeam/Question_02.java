package com.sunbeam;

import java.util.Scanner;

public class Question_02 {
	public static int searchByEmpid(Employee arr[],int size,int key)
	{
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i].getEmpid()==key)
				return i;
		}
		return -1;
	}
	
	public static int searchByName(Employee arr[],int size,String key)
	{
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i].getName().equals(key))
				return i;
		}
		return -1;
	}
	
	public static int searchBySalary(Employee arr[],int size,double key)
	{
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i].getSalary()==key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Employee[] arr=new Employee[3];
		int choice;
		
		arr[0]=new Employee(1, "Nivedita", 15000);
		arr[1]=new Employee(2, "pratik", 12000);
		arr[2]=new Employee(3, "prabha", 10000);
		do
		{
			System.out.println("enter the choice");
			System.out.println("1. sort by empid");
			System.out.println("2. sort by name");
			System.out.println("3. sort by salary");
			choice=new Scanner(System.in).nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("enter the empid to be search");
				int key=new Scanner(System.in).nextInt();
				int index=searchByEmpid(arr, arr.length, key);
				if(index!=-1)
					System.out.println("Employee of empid "+key+" is found");
				else 
					System.out.println("Employee of empid "+key+" is not found");
				break;
				
			case 2:
				System.out.println("enter the name to bo search");
				String key1=new Scanner(System.in).next();
				int index1=searchByName(arr, arr.length, key1);
				if(index1!=-1)
					System.out.println("Employee of name "+key1+" is found");
				else 
					System.out.println("Employee of name "+key1+" is not found");
				break;
				
			case 3:
				System.out.println("enter the salary to bo search");
				double key2=new Scanner(System.in).nextDouble();
				int index2=searchBySalary(arr, arr.length, key2);
				if(index2!=-1)
					System.out.println("Employee of salary "+key2+" is found");
				else 
					System.out.println("Employee of salary "+key2+" is not found");
				break;
			}
			
		}while(choice!=0);

	}

}
