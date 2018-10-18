package firstjenkins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandelMultipleCheckBox {
	@Test(enabled=false)

	public static void checkBox() {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement element: checkboxes)
		{
			element.click();
		}

	}

}
