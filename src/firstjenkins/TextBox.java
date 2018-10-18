package firstjenkins;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.jboss.netty.util.internal.SystemPropertyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TextBox {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		try {
			URL url= new URL("https://www.amazon.in");
			HttpURLConnection httpurl=(HttpURLConnection)url.openConnection();
			Assert.assertTrue(httpurl.getResponseCode()==200);
			System.out.println(httpurl.getResponseMessage());
			//driver.findElement(By.xpath("//a[@class='a-carousel-goto-nextpage']/i")).click();
			WebElement b=driver.findElement(By.xpath("//a[@class='a-carousel-goto-nextpage']/i"));
			 

			driver.findElement(By.xpath("//a[@class='a-carousel-goto-nextpage']/i")).click();
			driver.findElement(By.xpath("//a[@class='a-carousel-goto-nextpage']/i")).click();
		} catch (AssertionError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
