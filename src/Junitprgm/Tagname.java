package Junitprgm;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
	ChromeDriver	 driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void test()
	{
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		
		for(WebElement l:li)
		{
			//System.out.println("text: "+l.getText());
			System.out.println("attriute: "+l.getAttribute("href"));
		}	
	}
	
	@After
	public void ending()
	{
		driver.quit();
	}
}

