package Junitprgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoVisible {
	ChromeDriver	 driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void starting() 
	{
		WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		boolean s=logo.isDisplayed();
		if(s)
		{
			System.out.println("displayed");
		}
		else
		{
			System.out.println("failed");
		}
		
		WebElement radiobutton=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[9]/div/label[1]/input"));
	    boolean d=radiobutton.isSelected();
		if(d)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}	
		
		
		WebElement check=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[15]/div/input"));
	    boolean c=check.isSelected();
		if(c)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}	
	}
}
