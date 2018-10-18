package firstjenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeachGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Create an account']//following::input[@type='text'][1]")).sendKeys("selenium",Keys.ENTER);
		

	}

}
