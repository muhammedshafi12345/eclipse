package Test_pckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_pckg.Keralapropertypage;

public class Keralapropertytest {
WebDriver driver;
@BeforeTest
public void browser()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://keralaproperty.in/member/login/");
}
@Test
public void test()
{
	Keralapropertypage ob=new Keralapropertypage(driver);
	ob.setvalues("abc@gmail.com","abcd");
	ob.login();
}
}
