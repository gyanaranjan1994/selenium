package project1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLink {

	public static void main(String[] args) throws Throwable, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://symfony.com/");
		List<WebElement> listOfLinks=driver.findElements(By.tagName("a"));
		listOfLinks.addAll(driver.findElements(By.tagName("img")));
		System.out.println(listOfLinks.size());
		List<WebElement> activeLinks=new ArrayList<WebElement>();
		for(int i=0;i<listOfLinks.size();i++)
		{
			if(listOfLinks.get(i).getAttribute("href")!=null && (!listOfLinks.get(i).getAttribute("href").contains("javascript")))
			{
				activeLinks.add(listOfLinks.get(i));
			}
		}
		System.out.println(activeLinks.size());
		for(int j=0;j<activeLinks.size();j++)
		{
			HttpURLConnection connection=(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response=connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"------>"+response);
		}
		
		

	}

}
