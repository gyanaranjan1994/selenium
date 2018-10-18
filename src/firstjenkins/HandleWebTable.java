package firstjenkins;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.espncricinfo.com/table/series/8048/season/2018/indian-premier-league/");
		List<WebElement> data=driver.findElements(By.xpath("//div[@class='responsive-table-wrap']/table/tbody//td[1]/a[2]/span"));
		
		
		for(WebElement element:data)
		{
			String cell=element.getText();
			
			
			if(cell.equalsIgnoreCase("Sunrisers Hyderabad"))
			{
				element.click();
				
				break;
			}
		}
	
		
		

	}

}
