package firstjenkins;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//get the text by javascript
		String str=js.executeScript("return document.getElementById('loginbutton').innerHTML").toString();
		System.out.println(str);
		//enter data by using javascript
		js.executeScript("document.querySelector(\"input[class^='inputte'][id*='ail']\").value='gyan'");
		js.executeScript("document.getElementById('pass').value='ranjan'");
		//click action using javascript
		js.executeScript("document.querySelector(\"input[type='submit']\").click()");
		//refresh page
		Thread.sleep(2000);
		js.executeScript("history.go(0)");
		//get title by using java Script
		String title=js.executeScript("return document.title").toString();
		System.out.println(title);
		Thread.sleep(2000);
		//navigate back using javascript
		js.executeScript("window.history.back()");
		Thread.sleep(2000);
		//scroll down using javascript
		js.executeScript("window.scrollBy(0,100)");
		//scrollup using java scrit
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(100,0)");
		

	}

}
