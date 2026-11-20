package Test_pckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_pckg.Keralapropertypage;
import Page_pckg.blazedemologin;

public class blazedemologin1 {
	WebDriver driver;
	@BeforeTest
	public void browser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/login");
	}
	@Test
	public void test()
	{
		blazedemologin ob=new blazedemologin(driver);
		ob.setvalues("shafi@gmail.com","sha123");
		ob.login();
		
	}

}
