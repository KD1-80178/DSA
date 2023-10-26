package com.sunbeam;

public class Question_05 {
	
	public static int linearSearch(int arr[],int size)
	{
		
		for (int i=0;i<arr.length;i++)
		{
			int cnt=0;
			for (int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]==arr[j])
				{
					cnt++;
					break;
				}
				
			}
			if(cnt==0)
				return arr[i];
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int arr[]={ 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		
		int element=linearSearch(arr,arr.length);
		System.out.println(element);
	}

}
