package program;

public class ErrorHandel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new NullPointerException();
			
		}
		catch (ArithmeticException a) {
			System.out.println("arithmetic exception");
		}catch (ArrayIndexOutOfBoundsException b ) {
			System.out.println("array index out of boundary exception");
		}catch (NullPointerException c) {
			System.out.println("null poin exception");
		}catch (Exception e) {
			System.out.println("nomral exception ");
		}
		
		

	}

}
