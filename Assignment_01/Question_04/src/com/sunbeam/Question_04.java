package com.sunbeam;

import java.util.Scanner;

public class Question_04 {
	
	public static int linearSearch(int arr[],int key,int occurence)
	{
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				cnt++;
				if(occurence==cnt)
					return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {10,20,45,78,78,10,20};
		System.out.println("enter the key");
		int key=new Scanner(System.in).nextInt();
		System.out.println("enter the occurence");
		int occurence=new Scanner(System.in).nextInt();
		
		int index=linearSearch(arr,key,occurence);
		
		if(index==-1)
			System.out.println(occurence+ "  Occurence of key "+key+" is not found");
		else
			System.out.println(occurence+ "  Occurence of key "+key+" is found at index "+index);;
			
	}

}
