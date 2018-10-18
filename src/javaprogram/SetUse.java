package javaprogram;

import java.util.ArrayList;
import java.util.Set;

public class SetUse {
	public static void main(String [] args)
	{
	String str="gdfvncnfsccsdddsd";
	String str1="";
	for(int i=0;i<str.length();i++)
	{
		
	
	if(!str1.contains(str.valueOf(str.charAt(i))))
	{
		str1=str1+str.charAt(i);
	}
	else
	{
		
	}
	}
	System.out.println(str1);
	
}

}
