package program;

public class ReverseHello_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello world";		String rev="";
		String rev1="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				for(int j=i;j>=0;j--)
				{
					rev=rev+str.charAt(j);
				}
				 for(int j=str.length()-1;j>=rev.length();j--)
				 {
					 rev1=rev1+str.charAt(j);
				 }
			}
		}
		//System.out.println(rev);
		//System.out.println(rev1);
		System.out.println((rev+" "+rev1).trim());
		
		

	}

}
