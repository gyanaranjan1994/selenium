package program;

public class ReversNumber {

	public static void main(String[] args) {
		int no = 432;
		int sum = 0 ;
		int pos;
		String num = ""+no;
		char[] noArry = num.toCharArray();
		for (int i = 0; i < noArry.length; i++) {
			pos = i+1;
			int j = Integer.parseInt(""+noArry[i]);
			int tempSum = 1;
			for (int j2 = 0; j2 < pos; j2++) {
				tempSum = tempSum *j;
			}
			sum = sum + tempSum;
		}
		System.out.println(sum);
	}
}

		


