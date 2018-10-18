package program;

import java.util.Arrays;

public class RemoveDuplicateWithOutUsingTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int arr []= {1,2,2,3,4,4};
		int j=0;
		for (int i = 0; i < n-1; i++) {
			if(arr[i]!=arr[i+1])
			{
				arr[j++]=arr[i];
			} else {
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	

	}

}
