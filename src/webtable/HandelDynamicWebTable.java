package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandelDynamicWebTable {
	public static void main(String [] args)
	{
		 WebDriver driver= new FirefoxDriver();
		 //driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("http://www.moneycontrol.com/sensex/bse/sensex-live");
		WebElement table=driver.findElement(By.xpath("//strong[text()='Compare Sensex performance']//following::table[@class='tbldata06 b_12']"));
		List<WebElement> row=table.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++)
		{
			List<WebElement> col=row.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < col.size(); j++) {
				String celltext=col.get(j).getText();
				//System.out.println("cell value of row no: "+i+" and column no "+j+" is "+celltext );
				if(celltext.equals("35106.57"))
				{
					System.out.println(col.get(j).getText());
				}
				
			}
			//System.out.println("------------------------------------------------");
		}
		
		 
	}

}
