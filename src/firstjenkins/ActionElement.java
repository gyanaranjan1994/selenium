package firstjenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		/*WebElement element=driver.findElement(By.xpath("//a[@id='nav-link-shopall']"));
		WebElement subelement=driver.findElement(By.xpath("//span[text()='Kindle E-Readers & eBooks']"));
		Actions action= new Actions(driver);
		action.moveToElement(element).perform();
		action.moveToElement(subelement).perform();
*/
		/*WebElement element= driver.findElement(By.xpath("//a[text()='Your Amazon.in']"));
		Actions action= new Actions(driver);
		action.doubleClick(element).perform();
*/	
		/*WebElement element= driver.findElement(By.xpath("//a[text()='Amazon Pay']//preceding-sibling::a[1]"));
		Actions action= new Actions(driver);
		action.contextClick(element).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();*/
		Actions action= new Actions(driver);
		Thread.sleep(2000);
		WebElement dragelement=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropelement=driver.findElement(By.xpath("//div[@id='droppable']"));
		action.dragAndDrop(dragelement, dropelement).build().perform();
		
	}

}
