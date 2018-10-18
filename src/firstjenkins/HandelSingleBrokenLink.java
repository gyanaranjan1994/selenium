package firstjenkins;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandelSingleBrokenLink {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		URL url=new URL("https://www.timeanddate.com/worldclock/");
		HttpURLConnection httpurl=(HttpURLConnection)url.openConnection();
		if(httpurl.getResponseCode()==200)
		{
			System.out.println(httpurl.getResponseMessage());
		}
		

	}

}
