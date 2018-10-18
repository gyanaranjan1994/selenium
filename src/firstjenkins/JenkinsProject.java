package firstjenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class JenkinsProject {
	@Test
	public void facebook()
	{
		ProfilesIni profile= new ProfilesIni();
		FirefoxProfile myprofile=profile.getProfile("selenium");
		WebDriver driver = new FirefoxDriver(myprofile);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//input[starts-with(@id,'ema')]")).sendKeys("gyanranjan");
		WebElement element= driver.findElement(By.xpath("//*[@id='pass']"));
		System.out.println(element.getAttribute("value"));
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("gyan");
		driver.findElement(By.xpath("//a[normalize-space(text())='Forgotten account?']")).click();
	}

}
