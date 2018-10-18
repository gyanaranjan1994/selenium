package javaprogram;

public class child extends Parent {
	public void add()
	{
		//super.add();
		System.out.println("not add");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent c= new child();
		c.add();
		

	}

}
