package javaprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class SortingAarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("gourav");
		arrayList.add("raja");
		arrayList.add("rahul");
		arrayList.add("gyan");
		arrayList.add("rajesh");
		TreeSet<String> treeSet= new TreeSet<String>(arrayList);
		System.out.println(treeSet);
		ArrayList<String> arrayList2= new ArrayList<String>(treeSet);
		for(int i=0;i<arrayList.size();i++)
		{
			if (arrayList.get(i).equals(arrayList2.get(i))) {
				System.out.println("true"+i);
				
			}
			else
				System.out.println("false"+i);
		}
	
	
		

	}

}
