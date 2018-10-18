package firstjenkins;

import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScroolDown {
	public static void duplicate(String str)
	{
		HashMap< Character, Integer> tigger= new HashMap<>();
		char[] carry=str.toCharArray();
		for(char c:carry)
		{
			if(tigger.containsKey(c))
			{
				tigger.put(c, tigger.get(c)+1);
			}
			else
			{
				tigger.put(c, 1);
			}
		}
		Set <Character> setchar=tigger.keySet();
		System.out.println("Duplicat in "+str);
		for(Character c:setchar)
		{
			if(tigger.get(c)>1)
			{
				System.out.println(c+" "+tigger.get(c));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('email').value='gyan'");
		jse.executeScript("document.getElementById('u_0_8').click()");
		*/
		duplicate("gjjjjjjjjjjjvcdzxbbczc");

	}

}
