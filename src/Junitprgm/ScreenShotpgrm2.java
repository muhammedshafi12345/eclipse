package Junitprgm;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotpgrm2 {
	ChromeDriver	 driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void starting() throws Exception
	{
		WebElement dayElement=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input"));
		File srcl=dayElement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcl,new File("./ScreenShot//Element.png"));
	}
}
