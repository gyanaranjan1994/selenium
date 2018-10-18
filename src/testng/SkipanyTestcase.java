package testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipanyTestcase {
	@Test()
	public void skipedTestMethod()
	{
		throw new SkipException("test method is skipped");
		
	}

}
