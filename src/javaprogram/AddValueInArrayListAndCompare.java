package javaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AddValueInArrayListAndCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr= new ArrayList<String>();
		String s="gyan";
		String s1="gourav";
		String s2="raja";
		arr.add(s);
		arr.add(s1);
		arr.add(s2);
		ArrayList<String> arr1= new ArrayList<String>();
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
				

	}

}
