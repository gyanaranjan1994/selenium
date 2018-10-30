package program;

public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(revers("hello"));
	}

		public static String revers(String str)
		{
			if(str.length()<=1)
			{
			return str;
			}
			else
			{
				return revers(str.substring(1, str.length()))+str.charAt(0);
			}
			
					
		}
	}


