package javaprogram;

import java.util.Arrays;

public class ArraySorting {
//	public static int arrayR(int a[],int total) {
//		int temp;
//		for(int i=0;i<total;i++) {			
//		
//			for(int j=i+1;j<total;j++)
//			{
//				if(a[i]>a[j])
//				{
//    				temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//									}
//			
//		}	
//
//		
//	}
//
//		
//		return a[total];
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-1,10,98,56,78};
		
		int temp;
		for(int i=0;i<a.length;i++) {
			
		
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j] )
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					
				}
				
			}
			//System.out.println(a[i]);
			}
		System.out.println(Arrays.toString(a));
		

	}
}
