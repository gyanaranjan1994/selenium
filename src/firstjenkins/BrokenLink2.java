package firstjenkins;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLink2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://learn-automation.com/find-broken-links-using-selenium/");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		for(int i=0;i<link.size();i++)
		{
			WebElement elm=link.get(i);
			String url=elm.getAttribute("href");
			verifyLinks(url);
		
			
		}


	}
	public  static void verifyLinks(String links) throws Throwable
	{
		try {
			URL url= new URL(links);
			HttpURLConnection httpconnection=(HttpURLConnection)url.openConnection();
			httpconnection.setConnectTimeout(3000);
			httpconnection.connect();
			if(httpconnection.getResponseCode()==200)
			{
				System.out.println(links+" "+httpconnection.getResponseMessage());
			}
			if(httpconnection.getResponseCode()==httpconnection.HTTP_NOT_FOUND)
			{
				System.out.println(links+" "+httpconnection.getResponseMessage()+" "+httpconnection.HTTP_NOT_FOUND);
			}
			;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
