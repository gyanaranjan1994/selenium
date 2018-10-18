package javaprogram;

public class SecondLargestArray {
	public static int arraylarge(int []a,int total)
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,6,5,2,4};
		System.out.println(arraylarge(a,6));

	}

}
