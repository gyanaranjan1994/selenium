package firstjenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://my.monsterindia.com/create_account.html?");
		driver.findElement(By.xpath(".//*[@id='wordresume']")).sendKeys("C:\\Users\\maverick\\Desktop\\original resume.doc");

	}

}
