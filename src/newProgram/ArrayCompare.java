package newProgram;

public class ArrayCompare {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,6,7,8,9};
		int value=a.length+1;
		int number=value*(value+1)/2;
		int fact=0;
		for(int i=0;i<a.length;i++)
		{
			fact=fact+a[i];
		}
		System.out.println(number);
		System.out.println(fact);
		int missingnumber=number-fact;
		System.out.println(missingnumber);

	}

}
