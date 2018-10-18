package firstjenkins;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementIsExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.get("https://www.facebook.com");
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
			driver.findElement(By.xpath("//input[@id='emailhhhh']"));
			System.out.println("element is present");
		} catch (NoSuchElementException e) {
			
			//e.printStackTrace();
			System.out.println("element not present");
		}*/
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name :" );
		String name=sc.nextLine();
*/		
		int [] arry= {1,2,4,7,9,18,15};
		Arrays.sort(arry);
		System.out.println("second larhest number arry="+arry[arry.length-2]);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(WebElement links: link )
		{
			System.out.println(links.getAttribute("href"));
		}
		

	}

}
