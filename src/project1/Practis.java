package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.espncricinfo.com/series/18018/game/1151960/essex-vs-india-tour-match-india-tour-of-ireland-and-england-2018");
		/*String path="//a[contains(text(),'Lokesh Rahul')]/parent::td//following-sibling::td[@data-reactid='212']";
		String data=driver.findElement(By.xpath(path)).getText();
		System.out.println(data);*/
		//*[@id='main-container']/div/div[3]/div[1]/article/div/table/tbody[1]/tr[1]/td[1]
		
		for(int i=1;i<=2;i++)
		{
			for(int j=1;j<=8;j++)
			{
				String data=driver.findElement(By.xpath("//*[@id='main-container']/div/div[3]/div[1]/article/div/table/tbody[1]/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+" || ");
			}
			System.out.println("\n"+"============================================================================");
		}

	}

}
