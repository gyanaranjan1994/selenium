package newProgram;

public class SortingArray {
	public int sort(int a[],int lenth)
	{
		int temp;
		for(int i=0;i<lenth;i++)
		{
			for (int j = i+1; j <lenth; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		return a[lenth];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,5,4};
		SortingArray sort=new SortingArray();
		sort.sort(arr, 4);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
