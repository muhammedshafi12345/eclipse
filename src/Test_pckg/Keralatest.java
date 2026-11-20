package Test_pckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_pckg.keralapage;

public class Keralatest {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void url()
{
	driver.get("https://keralaproperty.in/member/login/");
}
@Test
public void testlogin()throws Exception
{
	keralapage ob=new keralapage(driver);
	ob.setvalues("abc@gmail.com","abcd");
	ob.login();
}
}
