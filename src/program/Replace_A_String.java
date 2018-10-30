package program;

public class Replace_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String mail="moiarani.gyonaronjan@gmail.com";
		//String replace_mail=mail.replaceAll("[oi]", "#");
		//System.out.println(replace_mail);
		String str="abc def ghi";
		String rev="";
		String s="";
		String[] str1=str.split(" ");
		System.out.println(str1.length);
		for (int i = str1.length-1; i >=0 ; i--) {
			 s=s+str1[i]+" ";
			 
		}
		System.out.println(s);
		for (int i =0; i <str1.length ; i++) {
			 
			 String word=str1[i];
			 String c="";
			 for (int j =word.length()-1; j>=0; j--) {
				 c=c+word.charAt(j);
				
			}
			 rev=rev+c+" ";
		}
	
System.out.println(rev);

	}

}
