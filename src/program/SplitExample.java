package program;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="2018/18/22";
		String [] replace=str.split("/");
		String  r1 = null;
		String  r2=null;
		String  r3=null;
		r1= replace[0];
		r2=replace[1];
		r3=replace[2];
		System.out.println(r1+" "+r2+" "+r3);
		

	}

}
