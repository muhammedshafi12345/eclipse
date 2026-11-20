package TESTNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Iframe_prgm {
WebDriver driver;
@BeforeMethod
public void setup() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");
}
	
	@Test
	public void test()
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//switch to first iframe
	WebElement framel = driver.findElement (By.id("iframeResult"));

	driver.switchTo(). frame (framel);

	// Switch to inner iframe 
	WebElement innerFrame = driver.findElement (By.tagName("iframe"));
	driver.switchTo().frame (innerFrame);

	// Now access hl
	WebElement text = driver.findElement (By.xpath("/html/body/h1"));
	System.out.println(text.getText());

	// Come back to main page
	driver.switchTo().defaultContent();
}
	@AfterTest
	public void browserclose()
	{
		driver.quit();
	}
}
