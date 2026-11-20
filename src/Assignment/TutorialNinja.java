package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TutorialNinja {
ChromeDriver	 driver;
@BeforeTest
public void browser()
{
	driver=new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/");
}
@Test
public void execution() throws IOException 
{
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Muhammed");
	driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("shafi");
	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("shafii@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("7628827281");
	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("shafi12");
	driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys("shafi12");
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
	
	WebElement email=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
	File srcl=email.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(srcl,new File("./ScreenShot//Email.png"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();//privacypolicy
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();

	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	WebElement map=driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[3]/a\r\n"));
	File src=map.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src,new File("./ScreenShot//map.png"));
	

	driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[1]/a")).click();
	
	driver.findElement(By.xpath("//*[@id=\"input-name\"]\r\n")).sendKeys("shafi");
	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("shafii@gmail.com");//contact
	driver.findElement(By.xpath("//*[@id=\"input-enquiry\"]")).sendKeys("No Commant");//contact
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input")).click();//contact

}

}
