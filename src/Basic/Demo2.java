package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://keralaproperty.in/member/login");
driver.findElement(By.id("ulogin")).sendKeys("shafi@11");
driver.findElement(By.id("upass")).sendKeys("pass!11");
driver.findElement(By.id("sub_logbtn")).click();
	}

}
