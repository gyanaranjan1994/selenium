package javaprogram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i;int m=0;int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ennter a number");
		int n=sc.nextInt();
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println(n +"is not prime number");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println("not prime number");
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("this is prime number");
		}
		*/
		int flag=0;
		int n=11;
		if(n==0 ||n==1)
		{
			System.out.println("it is not a prime number");
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					System.out.println("it is not a prime number");
					flag=1;
					break;
				}
				
			}
		}
		if(flag==0)
		{
			System.out.println("it is a prime number");
		}
	
	

	}

}
