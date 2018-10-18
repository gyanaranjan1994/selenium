package firstjenkins;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandelDynamicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-table/");
		WebElement table=driver.findElement(By.xpath(".//*[@id='content']/table"));
		List<WebElement> row=table.findElements(By.tagName("tr"));
		System.out.println(row.size());
		for(WebElement rows: row)
		{
			//System.out.println(rows.getText());
			List<WebElement> colum=rows.findElements(By.tagName("td"));
			if(rows.getText().equalsIgnoreCase("Country"))
			{
				
			
			for(WebElement colums:colum)
			{
				{
					System.out.println(colums.getText());
				}
			}
		}
		
		}
		
		

	}

}
