package Junitprgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlert {
	ChromeDriver	 driver;
	@Before
	public void starting() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(5000);
		
	}
	@Test
	public void alerthandle()
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();
		Alert a=driver.switchTo().alert();
		String texta=a.getText();
		System.out.println(texta);
		a.accept();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]/button")).click();
		Alert b=driver.switchTo().alert();
		String textb=b.getText();
		System.out.println(textb);
		b.dismiss();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button")).click();
		Alert c=driver.switchTo().alert();
		String textc=c.getText();
		System.out.println(textc);
		c.sendKeys("Good morning");
		c.accept();
		
	}
	
}
