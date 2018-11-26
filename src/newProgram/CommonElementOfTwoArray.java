package newProgram;



public class CommonElementOfTwoArray {
	public static void main(String [] args)
	{
	int [] arr1= {1,2,3,5,6};
	int [] arr2= {1,4,5,6,7};
	for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
			if(arr1[i]==arr2[j])
			{
				System.out.println(arr2[j]);
			}
			
		}
		
	}
	}
	

}
