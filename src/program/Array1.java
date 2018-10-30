package program;

import java.util.Arrays;

import org.testng.internal.junit.ArrayAsserts;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,10,30,20,40,};
		int j=0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
				
			}
			
		}
		arr[j]=arr[arr.length-1];
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		

	}

}
