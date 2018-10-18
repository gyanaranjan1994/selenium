package project1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com/");
		JavascriptExecutor jsp= (JavascriptExecutor)driver;
		jsp.executeScript("alert('Welcome To SoftwareTestingMaterial');");
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.quit();
		System.out.println(driver.getTitle());
		
		/*String str=jsp.executeScript("return document.title;").toString();
		System.out.println(str);
		jsp.executeScript("document.getElementById('ctl00_mainContent_chk_friendsandfamily').checked='false';");
		jsp.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		jsp.executeScript("window.scrollBy(0,-750)");
		//String str1=jsp.executeScript("return document.documentElement.innerText").toString();
		//return document.documentElement.innerText;
		//System.out.println(str1);
		String str1=jsp.executeScript("return document.URL;").toString();
		System.out.println(str1);*/
		TakesScreenshot tke= (TakesScreenshot)driver;
		File src=tke.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\maverick\\Desktop\\resume\\file.jpg"));
		
		

	}

}
