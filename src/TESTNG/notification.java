package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class notification {
	WebDriver driver;
	private char[] handles;
	@BeforeTest
	public void set() 
	{
	 driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
ChromeOptions options=new ChromeOptions();
options.addArguments("--disable-notifications");
driver=new ChromeDriver(options);
	}
	@Test
	public void fileupload() 
	{
		driver.get("https://www.justdial.com/");
	}
}
