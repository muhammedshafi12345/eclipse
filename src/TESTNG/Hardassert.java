package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Hardassert {
WebDriver driver;
@BeforeTest
public void browser()
{
	driver=new ChromeDriver();
	driver.get("https://keralaproperty.in/");
}
@Test
public void test1()
{
	String actual=driver.getTitle();
	String expected="www.facebook.com1";
	
	Assert.assertEquals(actual,expected,"title verified");
	System.out.println("title");
}
@Test
public void test2()
{
	WebElement search=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/form/div/input[2]"));
	boolean searchenable=search.isEnabled();
	
Assert.assertTrue(searchenable,"it is not enabled");
}
}
