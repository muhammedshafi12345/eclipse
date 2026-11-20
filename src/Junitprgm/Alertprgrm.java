package Junitprgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgrm {
	ChromeDriver	 driver;
	@Before
	public void set() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/shafi/OneDrive/Desktop/alert.html");
	Thread.sleep(5000);
	}
	@Test
	public void alerthandle() throws InterruptedException
	{
	driver.findElement(By.xpath("/html/body/input[1]")).click();
	Alert a=driver.switchTo().alert();
	String text=a.getText();
	if( text.equals("Hello!I am an alert box!!"))
	{
		System.out.println("test pass");
	}
	else
	{
		System.out.println("test fail");
	}
	a.accept();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("123");
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	Thread.sleep(2000);
	}
}
