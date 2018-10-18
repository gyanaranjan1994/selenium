package firstjenkins;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandelAthendication {
	@Test
	public void handel() throws IOException, Throwable
	{
		WebDriver driver= new FirefoxDriver();
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Runtime.getRuntime().exec("D:\\AutoIT\\username.exe");
		driver.get(" https://www.engprod-charter.net/");
	}

}
