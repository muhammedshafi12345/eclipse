
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragDrop{
	WebDriver driver;
	@BeforeTest
	public void
	setup()
	{
	driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
	driver.get("https://webdriveruniversity.com/Actions/index.html");
	}
	@Test
	public void testl() throws InterruptedException
	{
	WebElement src= driver.findElement (By.xpath("/html/body/div/div[2]/div/div[1]"));
	WebElement dest=driver.findElement (By.xpath("//*[@id='droppable']"));
	Actions act=new Actions (driver);
	act.dragAndDrop(src, dest).perform();

	String text=dest.getText();
   if (text.equals("Dropped"))
   {
	   System.out.println("Dropped");
   }
   else
   {
	   System.out.println("not expected");
   }
    }
}
