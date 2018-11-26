package newProgram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello  world";
		int k=0;
		char [] ch=str.toCharArray();
		String rev="";
		for (int i = 0; i < str.length(); i++) {
			
			if(ch[i]!=' ') {
			
				k++;
				System.out.println(i);
			
			}
			
			//int m=i-1;
			/*while(k>m)
			{
				rev=rev+str.charAt(m);
				m--;
			}
			*/
		}
		//System.out.println(rev);
		

	}

}
