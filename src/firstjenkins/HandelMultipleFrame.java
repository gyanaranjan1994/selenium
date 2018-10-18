package firstjenkins;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandelMultipleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/guru99home/");
		//List<WebElement> frame =driver.findElements(By.tagName("iframe"));
		//System.out.println(frame.size());
		/*for (int i = 0; i <=frame.size(); i++) {
			
			driver.switchTo().frame(i);
			int ele=driver.findElements(By.xpath("//a/img[contains(@src,'Jmeter720.png')]")).size();
			System.out.println(ele);
			driver.switchTo().defaultContent();
		}
*/	
		driver.switchTo().frame(1);
		boolean img=driver.findElement(By.xpath("html/body/a/img")).isDisplayed();
		System.out.println(img);

	}

}
