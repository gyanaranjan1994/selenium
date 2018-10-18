package newselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\freeCRMtest\\jarfile\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Robot robot= new Robot();
		driver.get("http://my.monsterindia.com/create_account.html?spl=G_Adgroup_Single%20Word%20Misspell%20Exact&WT.mc_n=olm_sk_srch_Google_Resume_Goo_Search_India_Brand_AllBrand&gclid=EAIaIQobChMI9oG48tXn2wIVVBOPCh2O3Ax9EAAYASAAEgKqbfD_BwE");
		/*List<WebElement> links=driver.findElements(By.xpath("//td//a"));
		for(int i=0;i<links.size();i++)
		{
			//System.out.println(links.get(i).getText());
			if(links.get(i).getText().contains("Kinshasa"))
			{
				links.get(i).click();
				break;
			}
		}*/
		//driver.get("https://www.google.co.in/?gws_rd=ssl");*/
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='gs_taif0']"))));
		//driver.findElement(By.xpath("//input[@class='gsfi'][2]")).sendKeys("selenium");
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('gs_taif0').value='selenium'");
		driver.findElement(By.xpath(".//*[@id='wordresume']")).click();
		robot.setAutoDelay(1000);
		/*StringSelection stringSelection=new StringSelection("C:\\Users\\maverick\\Desktop\\gyana1.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		*/

	}

}
