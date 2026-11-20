package Test_pckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_pckg.blazedemopage;
import Page_pckg.keralapage;

public class Blazedemotest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void testlogin()throws Exception
	{
		blazedemopage ob=new blazedemopage(driver);
		ob.setvalues("shafi","luminar","shafi@gmail.com","sha123","sha123");
		ob.login();
	}
}
