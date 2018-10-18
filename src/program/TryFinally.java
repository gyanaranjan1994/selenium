package program;

public class TryFinally {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			try {
				throw new Exception("simple Exception");
				
			} finally {
				System.out.println("hi finally 1");
				
			}
			
		} catch(Exception e) {
			System.out.println("hi catch 1");
			
		} finally
		{
			System.out.println("hi finally 2");
		}

	}

}
