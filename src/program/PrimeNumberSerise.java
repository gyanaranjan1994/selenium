package program;

public class PrimeNumberSerise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("it is not a prime number: "+0);
		System.out.println("it is not a prime number: "+1);
		
		for(int i=1;i<=50;i++)
		{
			int flag=0;
			if(i==0||i==1)
			{
				//System.out.println("it is not a prime number: "+i);
				

			}
			else
			{
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
					System.out.println("it is not a prime number: "+i);
					flag=1;
					break;
					}
				}
			}
			if(flag==0)
			{
				System.out.println("it is a prime number: "+ i);
			}
		}

	}

}
