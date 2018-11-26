package newProgram;

public class BoobleString {

	public static void main(String[] args) {
		String [] s1= {"gyan","rahul","raja","gaurav","rajesh","prakash"};
		String temp;
		for(int i=0;i<s1.length;i++)
		{
			for (int j = 0; j < s1.length-1-i; j++) {
				if(s1[j].compareTo(s1[j+1])<0)
				{
					temp=s1[j];
					s1[j]=s1[j+1];
					s1[j+1]=temp;
				}
				
			}
		}
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
			
		}

	}

}
