package Page_pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class keralapage {
WebDriver driver;
	By Kpmail=By.name("ulogin");
	By Kppass=By.name("upass");
	By kplogin=By.id("sub_logbtn");
	
	public keralapage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email,String password)
	{
		driver.findElement(Kpmail).sendKeys(email);
		driver.findElement(Kppass).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(kplogin).click();
	}
	
	 
}
