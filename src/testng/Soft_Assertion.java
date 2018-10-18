package testng;

import java.util.NoSuchElementException;

import org.openqa.selenium.ElementNotVisibleException;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Soft_Assertion {
	@Test(expectedExceptions=NoSuchElementException.class)
	public void assertion()
	{
		SoftAssert softAssert= new SoftAssert();
		String str="gyan";
		softAssert.assertEquals(str, "gya");
		softAssert.assertEquals(str, "gyan");
		softAssert.assertAll();
		
		
	}

}
