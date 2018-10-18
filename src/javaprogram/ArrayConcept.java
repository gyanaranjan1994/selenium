package javaprogram;

import java.util.Arrays;

public class ArrayConcept {
	public static void main(String [] args)
	{
		int arr[]= {1,5,2,3,1,2,4,4,5};
		int temp[]= new int[arr.length-1];
		int temp1=0;
		int k=0;
		//sorting
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp1=arr[i];
					arr[i]=arr[j];
					arr[j]=temp1;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[k]=arr[i];
				k++;
			}
		}
		temp[k]=arr[arr.length-1];
		System.out.println(Arrays.toString(temp));
	}

}
