package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datadriven {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void main() throws IOException
	{
		File f=new File("D:\\username.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook (fi);
		XSSFSheet sh=wb.getSheet("Sheet2");
		System.out.println(sh.getLastRowNum());
for(int i=1;i<=sh.getLastRowNum();i++)	
{
	String username=sh.getRow(i).getCell(0).getStringCellValue();
	System.out.println("username="+username);
	String pswd=sh.getRow(i).getCell(1).getStringCellValue();
	System.out.println(pswd);

	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);;
	driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pswd);
	
driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
String act=driver.getCurrentUrl();
String exp="https://www.saucedemo.com/inventory.html";
if(act.equals(exp))
{
	System.out.println("Title verified"+act);
	
}
else
{
	System.out.println("Title failed..");
}




}

	}
}
