package firstjenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inertext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element=driver.findElement(By.id("email"));
		System.out.println(element.getAttribute("innerHTML"));
		//String str=js.executeScript("return arguments[0].innerHTML;",element).toString();
		//System.out.println(str);
				

	}

}
