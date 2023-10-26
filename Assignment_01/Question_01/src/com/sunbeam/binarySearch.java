package com.sunbeam;

import java.util.Scanner;

public class binarySearch {
	
	public static void binarySearch(int arr[],int size,int key)
	{
		int left=0;
		int right=arr.length-1;
		int mid,cnt=0;
		while(left<=right)
		{
			mid=(left+right)/2;
			cnt++;
			if(key==arr[mid])
			{
				System.out.println("key is found at index  = "+mid);
				break;
			
			}			
			else if(key<arr[mid])
				right=mid-1;
			else
				left=mid+1;
		}
		System.out.println("No. of comparisions = "+cnt);
	}

	public static void main(String[] args) {
		int arr[]= {10,20,22,56,80,79,89};
		
		System.out.println("enter the key to be searched ");
		int key=new Scanner(System.in).nextInt();
		
		binarySearch(arr, arr.length, key);
		
	}

}
