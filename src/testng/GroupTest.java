package testng;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(groups= {"sainait"})
	public void group1()
	{
		System.out.println("sainait group exeute");
	}
	@Test(groups= {"regression"})
	public void group2()
	{
		System.out.println("regression group execute");
	}
	@Test(groups= {"sainait","regression"})
	public void group3()
	{
		System.out.println("sainait and regression execute");
	}

}
