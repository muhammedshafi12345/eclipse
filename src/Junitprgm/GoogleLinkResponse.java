package Junitprgm;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinkResponse {
	ChromeDriver driver;
	String baseurl="https://www.google.com/";
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void linkcount() throws Exception
	{
		List<WebElement> li = driver.findElements(By.tagName("a"));
		for(WebElement l:li)
		{
			String links=l.getAttribute("href");
			Verify(links);
		}
		}
	public void Verify(String links)
	{
	try
	{
	URL ob=new URL(links);
	HttpURLConnection con=(HttpURLConnection)ob.openConnection();
	con.connect();
		if(con.getResponseCode()==200)
			
		{
			System.out.println("valid---"+links);
		}
		else
		{
			System.out.println("ivalid url");
		}
		
	}

catch(Exception e)
{
	System.out.println(e.getMessage());
}
	}
}
