package newselenium;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions action= new Actions(driver);
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		WebElement dragElement1=driver.findElement(By.xpath("//h3[contains(text(),'Items to Drag')]/following-sibling::span[1]"));
		WebElement dragElement2=driver.findElement(By.xpath("//h3[contains(text(),'Items to Drag')]/following-sibling::span[2]"));
		WebElement dropElement=driver.findElement(By.xpath("//div[@id='mydropzone'and @dropzone='move']"));
		
		Thread.sleep(1000);
		/*action.clickAndHold(dragElement1)
		.moveToElement(dropElement)
		.release(dropElement).build().perform();*/
		action.dragAndDrop(dragElement1, dropElement).build().perform();
		Robot robot= new Robot();
		robot.delay(100);
		robot.mouseMove(100, 484);
		

	}

}
