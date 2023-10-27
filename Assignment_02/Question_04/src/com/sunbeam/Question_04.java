package com.sunbeam;

import java.util.Arrays;

public class Question_04 {

	public static void insertionSort(int arr[],int N)
		{
			int cnt=0;
			for(int i=1 ; i < N ; i++)
			{
				int temp=arr[i];
				int j=i-1;
				
				while(j>=0 )
				{
					cnt++;
					if(arr[j]<temp)
					{
					arr[j+1]=arr[j];
					j--;
					}
					else
						break;
				}
				arr[j+1]=temp;
			}
			System.out.println("Total no of comparision = "+cnt);
		}

		public static void main(String[] args) {
			int arr[]= {41,12,54,69,87,41,23,25};
			System.out.println("Arrays before sort = "+Arrays.toString(arr));
			
			insertionSort(arr, arr.length);
			System.out.println("Arrays after sort = "+Arrays.toString(arr));

		}


}