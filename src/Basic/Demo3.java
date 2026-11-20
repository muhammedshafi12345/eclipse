package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/inventory.html");
driver.findElement(By.name("user-name")).sendKeys("standard_user");
driver.findElement(By.name("password")).sendKeys("secret_sauce");
driver.findElement(By.name("login-button")).click();
driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	}

}
