package Assignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver	 driver;
	@Before
	public void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
	}
	@Test
	public void amazon()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//div[@id='nav-cart-text-container']")).click();
		driver.findElement(By.xpath("//div[@id='nav-link-accountList']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hshsjsydj");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click();
	}
	
}
