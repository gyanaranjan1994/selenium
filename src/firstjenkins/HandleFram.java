package firstjenkins;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFram {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		Thread.sleep(2000);
		List<WebElement> frame=driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
		for(int i=0;i<frame.size();i++)
		{
			driver.switchTo().frame(i);
			try {
				driver.findElement(By.xpath(".//*[@id='input_0']")).sendKeys("9439482154");
				driver.findElement(By.xpath(".//*[@id='input_1']")).sendKeys("9457872422");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				TakesScreenshot screenshot=(TakesScreenshot)driver;
				File src=screenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("C:\\Users\\maverick\\Desktop\\screenshot.jpg"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
				
				System.out.println(e.getMessage());
			}
			
		}
	}

}
