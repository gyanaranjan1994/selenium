package program;

import java.util.Arrays;

public class ArrayParameter {

	public static void main(String[] args) {
		int a[]= {1,3,2,4};
		shortingArray(a, 3);
		System.out.println(Arrays.toString(a));

	}
	public static int shortingArray(int [] a,int size)
	{
		int temp;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
			
		}
		return a[size];
	}

}
