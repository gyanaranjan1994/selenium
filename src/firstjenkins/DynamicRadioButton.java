package firstjenkins;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DynamicRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ProfilesIni profile=new ProfilesIni();
		FirefoxProfile mypro=profile.getProfile("selenium");
		WebDriver driver= new FirefoxDriver(mypro);
		driver.get("https://timesofindia.indiatimes.com/");
		Thread.sleep(2000);
		List<WebElement> frame=driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
		for(WebElement element: frame)
		{
			System.out.println(element.getAttribute("iframe"));
		}
		
	}		

}
