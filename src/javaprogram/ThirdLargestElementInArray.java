package javaprogram;

public class ThirdLargestElementInArray {
	public static int getThirdElemet(int a[],int total)
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
	
		return a[total-3];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,6,7,9,13};
		System.out.println(getThirdElemet(a, 5));

	}

}
