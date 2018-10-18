package firstjenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\OrangeaHRM\\CommonJarFiles\\chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://youtube.com");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("selenium");
		

	}

}
