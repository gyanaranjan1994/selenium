package javaprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StringS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver, 20);
		driver.get("https://paytm.com/");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Log In/Sign Up')]")));
	    driver.findElement(By.xpath("//div[contains(text(),'Log In/Sign Up')]")).click();
	    List<WebElement> frame=driver.findElements(By.xpath("//iframe"));
	    System.out.println(frame.size());
	    driver.switchTo().frame(0);
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id='input_0']")).sendKeys("gyan");
	}

}
