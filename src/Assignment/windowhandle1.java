package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class windowhandle1 {
	WebDriver driver;
	private char[] handles;
	@BeforeTest
	public void set() 
	{
	 
	 driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	}
	@Test
	public void url() 
	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20))	;
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("Iphone");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		String ip=driver.getWindowHandle();
		System.out.println(ip);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2/span")).click();
        
       
        Set<String> newtab=driver.getWindowHandles();
        for (String handle:newtab)
        {
        	if(!handle.equalsIgnoreCase(ip))
        	{
        		driver.switchTo().window(handle);
        		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20))	;
        		
        		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[10]/div[10]/div/div[1]/div/div/div/form/div/div/div/div/div[4]/div/div[17]/div[1]/span/span/span/input")).click();
        		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[10]/div[4]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div[2]/span/span/input")).click();
        		}
        	System.out.println(handle);
        }}}
