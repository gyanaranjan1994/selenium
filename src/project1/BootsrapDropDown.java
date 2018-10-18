package project1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootsrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\OrangeaHRM\\CommonJarFiles\\chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains(@class,'multiselect ')]")).click();
		List<WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//a//label"));
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if((!list.get(i).isSelected()))
			{
				list.get(i).click();
			}
			else
			{
				list.get(i).click();
			}
			
		}

	}

}
