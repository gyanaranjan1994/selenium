package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ShortingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ars= new ArrayList<String>();
		String s="gyan";
		String s1="gourav";
		String s2="rajesh";
		String s3="rahul";
		ars.add(s);
		ars.add(s1);
		ars.add(s2);
		ars.add(s3);
		Collections.sort(ars);
		System.out.println(ars);

	}

}
