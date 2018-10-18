package program;

public class ArrayProgram {

	public static void main(String[] args) {
		int [] arr= {1,3,2,1,2,4};
		boolean bl=false;
		//int flag=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==2 && arr[i+1]==2)
			{
				//flag=1;
				bl=true;
				System.out.println(bl);
				break;
			}
		}
			if(bl==false)
			{
				System.out.println(bl);
				
			}
			
		

	}

}
