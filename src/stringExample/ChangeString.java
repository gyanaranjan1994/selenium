package stringExample;


public class ChangeString {
	public String stringReplace(String str)
	{
		StringBuffer sbr = new StringBuffer();
		
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
		if(c[i]=='x'||c[i]=='y'||c[i]=='z'||c[i]=='X'||c[i]=='Y'||c[i]=='Z')
		{
		
			sbr.append((char)(c[i]-23));
		}else{
		    
			sbr.append((char)(c[i]+3));
		}
		}
		String s=sbr.toString();
		return s;
		
		   
	}

	public static void main(String[] args) {
		ChangeString cs= new ChangeString();
		String s=cs.stringReplace("abc");
		System.out.println(s);
		

}

}
