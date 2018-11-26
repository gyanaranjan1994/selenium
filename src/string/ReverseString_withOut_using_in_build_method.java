package string;


public class ReverseString_withOut_using_in_build_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello world india";
		int m=0;
		String s="";
		for (int i = 0; i <str.length(); i++) {
			int k=i;
			while(str.charAt(i)!=' ' && i<str.length()-1)
			{
				i++;
			}
			
			m=i-1;
			while(k<=m)
			{
				s=s+str.charAt(m);
				m--;
			}
			s=s+" ";
		
						
		}
		System.out.println(s);

	}

}
