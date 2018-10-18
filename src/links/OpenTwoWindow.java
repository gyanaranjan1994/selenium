package links;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class OpenTwoWindow {
	public static void main(String [] args) throws Throwable
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		Actions action= new Actions(driver);
		/*action.sendKeys(Keys.CONTROL+"n").build().perform();*/
	/*	JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.open()");
		Set<String> s=driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		String p=it.next();
		String c=it.next();
		driver.get("http://www.facebook.com");
		driver.switchTo().window(c);*/
		action.sendKeys(Keys.CONTROL+"p").build().perform();
		Robot robot= new Robot();
		robot.setAutoDelay(1000);
		robot.mouseMove(234, 108);
		robot.setAutoDelay(1000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1000);
        /*robot.keyPress(KeyEvent.VK_UP);
        
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(30000);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_Y);
		robot.keyRelease(KeyEvent.VK_Y);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.delay(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		
		
	}

}
