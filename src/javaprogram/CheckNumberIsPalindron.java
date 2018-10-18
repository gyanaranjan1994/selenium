package javaprogram;

public class CheckNumberIsPalindron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;int r;int temp;
		int sum=0;
		temp=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=(sum*10)+r;
		}
		if(temp==sum)
		{
			System.out.println("number is palindron");
		}
		else
		{
			System.out.println("number is not palindron");
		}

	}

}
