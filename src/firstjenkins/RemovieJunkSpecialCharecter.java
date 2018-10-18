package firstjenkins;

public class RemovieJunkSpecialCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="!@#$$%Gy&^$#(*an123a";
		//remove spcial charecter by using regular expression
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
