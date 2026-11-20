package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		String actualtitle=driver.getTitle();
		String expectedtitle="Google";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("test pass");
		}
		else 
		{
			System.out.println("test fail");
		}
		driver.close();
		
		
		
	}

}
