package project1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelBooststrapDropDown {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\OrangeaHRM\\CommonJarFiles\\chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
//		driver.findElement(By.id("dropdownMenuButton")).click();
//		List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu show')]//a"));
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getText());
//			if (list.get(i).getText().equalsIgnoreCase("Another action")) {
//				list.get(i).click();
//				break;
//				
//				
//			}
//			
//		}
		driver.findElement(By.id("dropdownMenuLink")).click();
		List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu show')]//a"));
		for (int i = 0; i < list.size(); i++) {
			String text=list.get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("Something else here")) {
				Thread.sleep(2000);
				list.get(i).click();
				
			}
			
		}

	}

}
