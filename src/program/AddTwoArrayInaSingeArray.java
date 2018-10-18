package program;

import java.util.Arrays;

public class AddTwoArrayInaSingeArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		int c[]= new int[a.length+b.length];
		int i=0;
		for( i=0; i<a.length; i++)
		{
			c[i] = a[i];
		}
		     

		     for(int j=0; j<b.length; j++) {
		    	 c[i++]=b[j];
		     }
		       
		System.out.println(Arrays.toString(c));
		

	}

}
