package opps;

public class ConstructorConcept {
	String name;
	int age;
	public void sum(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println(name+" "+age);
	}

	public static void main(int [] args) {
		// TODO Auto-generated method stub
		ConstructorConcept con=new ConstructorConcept();
		con.sum("gyan", 10);

	}

}
