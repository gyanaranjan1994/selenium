package program;

public class CompareTwoString {

	public static void main(String[] args) {
		
		String s="abdc";
		String s1="adbc";
		char [] c=s.toCharArray();
		char [] c1=s.toCharArray();
		char temp;
		
		if(s.equals(s1))
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("both are not same");
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		for(int i=0;i<c1.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c1[i]>c1[j])
				{
					temp=c1[i];
					c1[i]=c1[j];
					c1[j]=temp;
				}
			}
		}
		String org=String.valueOf(c);
		String org1=String.valueOf(c1);
		System.out.println(org);
		System.out.println(org1);
		if(org.equals(org1))
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("both are not same");
		}

	}

}
