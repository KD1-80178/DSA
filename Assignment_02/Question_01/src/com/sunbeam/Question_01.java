package com.sunbeam;

import java.util.Arrays;

public class Question_01 {
	
	public static void selectionSort(int arr[],int N)
	{
		int cnt=0;
		for (int i=0; i< N-1 ; i++)
		{
			
			for (int j=i+1 ; j< N ; j++)
			{
				cnt++;
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("No. of comparision = "+cnt);
	}

	public static void main(String[] args) {
		int arr[]= {10,15,40,23,56,87,45};
		System.out.println("Array before sort.."+Arrays.toString(arr));
		
		selectionSort(arr, arr.length);
		
		System.out.println("Array after sort .."+Arrays.toString(arr));
	}

}
