package firstjenkins;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Ab {
	
	public static void main(String[] args) {
		int count=0;
		String str2="gyan";
		/*str2.toCharArray();
		for(char s:str2.toCharArray())
		{
			count++;
		}
		
		System.out.println(count);*/
		
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(str2);
		while(scan.hasNext())
		{
			scan.next();
			count++;
		}
		System.out.println(count);
	}
}

	  
	   
	   
	   
	   
	   

		
