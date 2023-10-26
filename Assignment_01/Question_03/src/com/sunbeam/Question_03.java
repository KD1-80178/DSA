package com.sunbeam;

import java.util.Scanner;

public class Question_03 {
	public static int binarySearch(int arr[],int size,int key)
	{
		int left=0;
		int right=arr.length-1;
		int mid;
		while(left<=right)
		{
			mid=(left+right)/2;
			if(key==arr[mid])
			return mid;	
			
			else if(key<arr[mid])
				left=mid+1;
			else
				right=mid-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {60,50,45,42,35,30,16,10};
		
		System.out.println("enter the key to be searched ");
		int key=new Scanner(System.in).nextInt();
		
		int index=binarySearch(arr, arr.length, key);
		if(index==-1)
			System.out.println("key is not found ");
		else
			System.out.println("key is found at index "+index);
		
	}
}
