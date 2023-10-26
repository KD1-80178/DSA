package com.sunbeam;

import java.util.Scanner;

public class Question_06 {
	
	public static int linearSearch(int []arr,int size,int key)
	{
		int cnt=0;
		for (int i=0;i<arr.length;i++)
		{
			cnt++;
			if(arr[i]==key)
				return i;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int arr[]={ 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("enter the key");
		int key=new Scanner(System.in).nextInt();
		
		int rank=linearSearch(arr,arr.length,key);
		if(rank!=-1)
			System.out.println("key found at position ="+rank);
		else
			System.out.println("key is not found");

	}

}
