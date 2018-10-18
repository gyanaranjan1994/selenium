package program;

public class DeleteCharecterInString {
	public static void main(String []args)
	{
		//String str="hello";
		//String str1="";
		StringBuffer str= new StringBuffer("gyana");
		
		for (int i=1; i < str.length();i++) {	
			str=str.deleteCharAt(i);																													
		}
		System.out.println(str);
	}

}
