package firstjenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bodyh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://en.wikipedia.org/wiki/FIFA_18");
		//String s=driver.findElement(By.tagName("body")).getText();
		String s=driver.getPageSource();
		if(s.contains("and Xbox One versions include a continuation "))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		System.out.println(s);

	}

}
