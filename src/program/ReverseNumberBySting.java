package program;

public class ReverseNumberBySting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=123;
		String str=""+a;
		String rev="";
		for (int i =str.length()-1;i>=0; i--) {
			rev=rev+str.charAt(i);
			
		}
		int b=Integer.parseInt(rev);
		System.out.println(b);

	}

}
