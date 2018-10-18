package firstjenkins;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array1D {

	public static void main(String[] args) throws Throwable, IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many element: ");
		int n=Integer.parseInt(br.readLine());
		//creat 1D array
		int a[]= new int[n];
		System.out.println("enter element into array: ");
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
			
		}
		System.out.println("the entered elements in the array are: ");
		for(int i=0;i<n;i++)
		
		{
			System.out.println(a[i]+"\t");
		}

	}

}
