package firstjenkins;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;



public class Robot1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ProfilesIni profile= new ProfilesIni();
		FirefoxProfile mypro= profile.getProfile("selenium");
		WebDriver driver= new FirefoxDriver(mypro);
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath(".//*[@id='mainContent']/p[7]/a[1]")).click();
		Robot robot= new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		//robot.keyPress(KeyEvent.vk);

	}

}
