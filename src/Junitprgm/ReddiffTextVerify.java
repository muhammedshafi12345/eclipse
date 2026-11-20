package Junitprgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReddiffTextVerify {
ChromeDriver driver;
@Before
public void startig()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}

			@Test
			public void textverify()
			{
			WebElement l=driver.findElement(By.id("Register"));
			String act=l.getAttribute("value"); 
			if(act.equals("Create my account"))
			{
				System.out.println("Pass");
			}

			else
			{
			System.out.println("Fail");	
			}
}
}
