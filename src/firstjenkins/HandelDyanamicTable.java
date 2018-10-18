package firstjenkins;

import java.util.concurrent.TimeUnit;

import org.jboss.netty.util.internal.SystemPropertyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandelDyanamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.get("http://toolsqa.com/automation-practice-table/#");
		//*[@id='content']/table/tbody/tr[1
		//*[@id='content']/table/tbody/tr[2]/th
		//*[@id='content']/table/tbody/tr[4]/th
		String beforxpath="//*[@id='content']/table/tbody/tr[";
		String afterxpath="]/th";
		for(int i=1;i<=4;i++)
		{
			String name=driver.findElement(By.xpath(beforxpath+i+afterxpath)).getText();
			System.out.println(name);
		}
		String name2=driver.findElement(By.xpath("//td[contains(text(),'UAE')]/preceding-sibling::th")).getText();
		System.out.println(name2);*/
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20482/tp-vs-ddd-14th-match-tamil-nadu-premier-league-2018");
		String beforxpath="//*[@id='innings_1']/div[1]/div[";
		String afterxpath="]/div[2]/span";
		//*[@id='innings_1']/div[1]/iv[3]/div[2]/span
		//*[@id='innings_1']/div[1]/div[4]/div[2]/span
		//*[@id='innings_1']/div[1]/div[5]/div[2]/span
		//*[@id='innings_1']/div[1]/div[11]/div[2]/span
		for(int i=2;i<=11;i++)
		{
			//String name=driver.findElement(By.xpath(beforxpath+i+afterxpath)).getText();
			//System.out.println(name);
			for(int j=1;j<=7 ;j++)
			{
				String name1=driver.findElement(By.xpath(".//*[@id='innings_1']/div[1]/div["+i+"]/div["+j+"]")).getText();
				System.out.print(name1 +" || ");
				if(name1.contains("Ravisrinivasan Sai Kishore"))
				{
					driver.findElement(By.xpath(".//*[@id='innings_1']/div[1]/div["+i+"]/div["+j+"]")).click();
					break;
				}
				
			}
			//System.out.println();
			System.out.println("\n"+"================================================================================");
			//System.out.println(name);
		}

	}

}
