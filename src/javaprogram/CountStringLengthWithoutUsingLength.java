package javaprogram;

public class CountStringLengthWithoutUsingLength {

	public static void main(String[] args) {
		String str="gyana";
		char [] ch=str.toCharArray();
		int count=0;
		for(char s:ch)
		{
			count++;
		}
		System.out.println(count);
		

	}

}
