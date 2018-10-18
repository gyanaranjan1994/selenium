package firstjenkins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindTextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		List<WebElement> textbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(textbox.size());
		for(WebElement element: textbox)
		{
			element.click();
		}

	}

}
