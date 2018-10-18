package javaprogram;

public class RemoveduplicatecharecterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="gyana rajan moharana";
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			if(!str1.contains(String.valueOf(str.charAt(i))))
			{
				str1=str1+String.valueOf(str.charAt(i));
			}
		}
		System.out.println(str1.trim());

	}

}
