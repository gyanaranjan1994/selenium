package javaprogram;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="123abcde^*3ac";
		char ch[]=str.toCharArray();
		String news="";
		for(int i=0;i<str.length();i++)
		{
			if(!(ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='^'||ch[i]=='*'))
			{
				news=news+str.charAt(i);
			}
		}
		System.out.println(news);
		str=str.replaceAll("[123^*]", "");
		System.out.println(str);*/
		
		int n=5;
		int k=n*2-2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=k;j++)
			{
				System.out.print(" ");
			}
			k=k-1;
			for(int j=1;j<=i;j++)
			{
				System.out.print("1 ");
			}
			System.out.println();
		}

	}

}
