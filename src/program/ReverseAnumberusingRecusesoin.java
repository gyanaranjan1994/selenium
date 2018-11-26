package program;

public class ReverseAnumberusingRecusesoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverse(123));
		
	}
	public static int reverse(int n)
	{
		
		
		
		int sum = 0;
		if(n==0)
		{
			return sum;
		}
		else {
			int r;
			r=n%10;
			n=n/10;
			sum=sum*10;
			
			return reverse(r)+sum*10;
		}
	}

}
