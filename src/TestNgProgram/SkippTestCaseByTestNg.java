package TestNgProgram;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippTestCaseByTestNg {
	@Test(priority=1)
	public void testCase1()
	{
		System.out.println("test case1 execute");
	}
	@Test(priority=2,enabled=false)
	public void testCase2()
	{
		System.out.println("test case2 execute");
	}
	@Test(priority=3,expectedExceptions= SkipException.class)
	public void testCase3()
	{
		System.out.println("test case3 execute");
		throw new SkipException("Skipping - This is not ready for testing ");
		
	}

}
