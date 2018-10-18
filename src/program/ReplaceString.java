package program;

public class ReplaceString extends Adder {
	static int add(int a,int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hel oo1 23#@ $#%%%";
		str=str.replaceAll("[^0-9]"," ");
		System.out.println(str.replace(" ", ""));
	
		
		

	}

}
