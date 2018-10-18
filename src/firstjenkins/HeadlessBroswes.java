package firstjenkins;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeadlessBroswes {
	public static void main(String [] args) throws IOException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FileWriter fw=new FileWriter("C:\\Users\\maverick\\Desktop\\gyan1.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		driver.get("https://www.timeanddate.com/worldclock/");
		//String s=driver.findElement(By.className("inputtext")).getAttribute("name");
		//System.out.println(s);
		//driver.findElement(By.xpath("//*[@id='p0']//preceding-sibling::td/a[text()='Accra']")).click();
		//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[1]/td[1]/a
		String befor_xpath="//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[";
		String after_xpath="]/td[1]";
		for(int i=1;i<=36;i++)
		{
			//String name=driver.findElement(By.xpath(befor_xpath+i+after_xpath)).getText();
			//System.out.println(name);
			for(int j=1;j<=7;j++)
			{
				String name=driver.findElement(By.xpath("//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				//System.out.print(name+" || ");
				bw.write(name+ " || ");
				
				/*if(name.contains("San Salvador"))
				{
					driver.findElement(By.xpath("html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr["+i+"]/td["+j+"]/a")).click();
					break;
				}*/
				
				j++;
				
			}
			//System.out.println("\n"+"============================================");
			bw.newLine();
			bw.write("=====================================================");
			bw.newLine();
		}
		
		bw.close();
	}

}
