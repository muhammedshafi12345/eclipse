package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginvalidation {
	WebDriver driver;
	@BeforeTest
	public void set() 
	{
	 driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
	driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("Shafi123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys("sha@123");
		driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
		String s=driver.getTitle();
		System.out.println(s);
		if (s.equals("https://keralaproperty.in/member/myhome/"))
		{
			System.out.println("login validation succesfully");
		}
		else
		{
			System.out.println("login validation failed");
		}
			
	}
}
