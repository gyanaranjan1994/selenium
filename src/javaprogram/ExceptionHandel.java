package javaprogram;

public class ExceptionHandel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			try
			{
				throw new NullPointerException("my dara");
			}
			finally
			{
				System.out.println("sample1");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("sample2");
		}
		catch(NullPointerException n)
		{
			System.out.println("sample3");
		}
		

	}

}
