package program;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Hello World"  ;
	     String[] word=name.split(" ");
	     String reversename=" ";
	     int i,j;
	     for(i=0;i<word.length;i++){
	      String str=word[i];
	      String revstr=" "   ;
	      for(j=str.length()-1;j>=0;j--){
	         char chr=str.charAt(j) ;
	         revstr=revstr+chr;
	      }
	      reversename =reversename + revstr ;
	    }
	    System.out.println(reversename.trim());
		

	}

}
