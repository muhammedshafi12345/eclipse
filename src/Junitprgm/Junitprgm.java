package Junitprgm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitprgm {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://keralaproperty.in/member/login");
	
}
@Test
public void titleverification()
{
	String acttitle=driver.getTitle();
	String expected="Post your Property";
	if(expected.equals(acttitle))
	{
		System.out.println("test pass");
	}
	else
	{
		System.out.println("test fail");
	}
}
@Test
public void	contentverification()
{
	String acttitle=driver.getPageSource();
	String expected="Contact No.";
	if(acttitle.contains(expected))
	{
		System.out.println("test	pass");
	}
	else
	{
		System.out.println("test fail");
	}
}
@After
public void	quitin()
{
	driver.quit();
}


}