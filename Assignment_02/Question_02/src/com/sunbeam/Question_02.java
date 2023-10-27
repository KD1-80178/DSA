package com.sunbeam;

import java.util.Arrays;

public class Question_02 {
	
	public static void bubbleSort(int arr[],int N)
	{
		int cnt=0;
		int passes=0;
		int flag;
		for (int i=1 ; i < N ; i++)
		{
			flag=0;
			passes++;
			for(int j=0;j<N-i;j++)
			{
				cnt++;
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
		}
		System.out.println("No. of passes = "+passes);
		System.out.println("no. of count = "+cnt);
	}

	public static void main(String[] args) {
		int arr[]= {10,15,8,64,52,32,78,96,54};
		
		System.out.println("Array before sort "+Arrays.toString(arr));

		bubbleSort(arr, arr.length);
		System.out.println("Array after sort "+Arrays.toString(arr));

	}

}
