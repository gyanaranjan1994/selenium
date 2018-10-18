package javaprogram;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i,j;
//		for(i=1;i<5;i++)
//		{
//			for(j=1;j<=i;j++)
//			{
//			System.out.print("*");	
//			}
//			System.out.println();
//		}
		//int i,j,n=5,k=2*n-2;
//		for(i=1;i<n;i++)
//		{
//			for(j=1;j<k;j++)
//			{
//				System.out.print(" ");
//			}
//			k=k-2;
//			for(j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for(i=1;i<n;i++)
//		{
//			for(j=1;j<k;j++)
//			{
//				System.out.print(" ");
//			}
//			k=k-1;
//			for(j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		int num=1;
		for(int i=1;i<5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num=num+1;
			}
			System.out.println();
		}
	}

}
