package javaprogram;

import java.util.Arrays;

public class RemoveDuplicateSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3,3,3,4,4,4};
		int temp[] = new int[arr.length-1];
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[arr.length-1];
		System.out.println(Arrays.toString(temp));

	}

}
