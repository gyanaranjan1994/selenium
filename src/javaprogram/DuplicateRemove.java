package javaprogram;

import java.util.Arrays;

public class DuplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3,3,3,4,4,4,5};
		int j=0;
		int temp[]= new int[arr.length-1];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j]=arr[i];
				j++;
				
			}
		}
		temp[arr[j]]=arr[arr.length-1];
		System.out.println(Arrays.toString(arr));

	}

}
