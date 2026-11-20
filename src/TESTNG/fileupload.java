package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileupload {
	WebDriver driver;
	@BeforeTest
	public void set() 
	{
	 driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
	driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\shafi\\OneDrive\\Documents\\Resume.pdf");
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}
}
