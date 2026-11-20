package Junitprgm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentchildXpath {
	ChromeDriver	 driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void titleverification()
	{
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[2]/input")).sendKeys("Muhammed shafi");
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[3]/div/input")).sendKeys("Muhammeds1@gmail.com");
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[6]/div/input")).sendKeys("shafi@123");
	}
	@After
	public void ending()
	{
		driver.quit();
	}
}
