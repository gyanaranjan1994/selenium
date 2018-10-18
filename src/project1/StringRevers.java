package project1;

public class StringRevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="how are you";
		String s1="";
		String[] arr=s.split(" ");
		System.out.println(arr.length);
		for(int i=0; i<arr.length;i++)
		{
			String a=arr[i];
			String rev="";
			for(int j=a.length()-1;j>=0;j--)
			{
				rev=rev+a.charAt(j);
			}
			s1=s1+rev+" ";
		}
		System.out.println(s1);

	}

}
