package firstjenkins;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandledynamicDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
		int i=1;
		Select select=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")));
		
		
			try {
				while(i>0)
				{
					select.selectByIndex(i);
					Assert.assertTrue("not able to select",select.getFirstSelectedOption().isSelected());
					WebElement value=select.getFirstSelectedOption();
				
					System.out.println(value.getText());
					i++;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("all element are selected");
			}
			
	}

}
