package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoOfRowandNoColDynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		 //driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("http://www.moneycontrol.com/sensex/bse/sensex-live");
		 List<WebElement> col=driver.findElements(By.xpath("//strong[text()='Compare Sensex performance']"
		 		+ "//following::table[@class='tbldata06 b_12']//tr[1]//td"));
		 List<WebElement> row=driver.findElements(By.xpath("//strong[text()='Compare Sensex performance']"
		 		+ "//following::table[@class='tbldata06 b_12']//tr//td[1]"));
		 System.out.println(col.size());
		 System.out.println(row.size());
		 for (int i = 1; i <row.size(); i++) {
			 String rowvalue=row.get(i).getText();
			 System.out.println("row value "+i+" is "+rowvalue);
			
		}
		 for (int j = 1; j <col.size(); j++) {
			 String colValue=col.get(j).getText();
			 System.out.println("col value "+j+" is "+colValue);
			
		}

	}

}
