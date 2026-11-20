package TESTNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic {
@BeforeTest
public void browseropen()
{
	System.out.println("browser open");
}
@BeforeMethod
public void urlload()
{
	System.out.println("url load");
}
@Test(priority=2,invocationCount=3,enabled=false)
public void test1()
{
	System.out.println("test1");
}
@Test(priority=3)
public void test2()
{
	System.out.println("test2");
}
@Test(priority=1,dependsOnMethods= {"test2"})
public void test3()
{
	System.out.println("test3");
}
@AfterMethod
public void urlclose()
{
	System.out.println("url close");
}
@AfterTest
public void Browserclose()
{
	System.out.println("Browser close");
}
}
