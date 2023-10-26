package com.sunbeam;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		int arr[]= {11,33,44,22,55,66,98};
			
		System.out.println("Enter the key to be searched = ");
		int key=new Scanner(System.in).nextInt();
		
		linearSearch(arr,arr.length,key);
		
	}

	private static void linearSearch(int[] arr, int length, int key) {
		int cnt=0;
		
		
		for (int i=0;i<length;i++)
		{
			cnt++;
			if(arr[i]==key)
			{
				System.out.println("key is found at index "+i);
				break;
			}
					
		}
		
		System.out.println("No. of comparisions = "+cnt);
	}

}
