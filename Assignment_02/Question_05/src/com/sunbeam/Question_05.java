package com.sunbeam;

import java.util.Arrays;

public class Question_05 {
	public static void selectionSortBySalary(Employee arr[],int N)
	{
		for (int i=0; i< N-1 ; i++)
		{
			
			for (int j=i+1 ; j< N ; j++)
			{
				
				if(arr[i].getSalary()>arr[j].getSalary())
				{
					Employee temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		
			Employee[] arr=new Employee[3];
						
			arr[0]=new Employee(1, "Nivedita", 15000.0);
			arr[1]=new Employee(2, "pratik", 12000.0);
			arr[2]=new Employee(3, "prabha", 10000.0);
			
			System.out.println(Arrays.toString(arr));
			
			selectionSortBySalary(arr, arr.length);
			System.out.println(Arrays.toString(arr));

	}

}
