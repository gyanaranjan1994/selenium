package newProgram;

public class Reverse2words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello world";
		String rev="";
		char a=' ';
		for (int j = 0; j < str.length(); j++) {
			String c="";
			if(str.charAt(j)==a)
			{
				for (int i = j-1; i >=0; i--) {
					c=c+str.charAt(i);
					
				}
				
			}
			rev=c;
			
			
			
		}
		System.out.println(rev);
		

	}

}
