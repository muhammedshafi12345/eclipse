package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class pagesource {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualpage=driver.getPageSource();
		String expectedpage="Gmail";
		if (actualpage.contains(expectedpage))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		driver.close();
		
	}

}
