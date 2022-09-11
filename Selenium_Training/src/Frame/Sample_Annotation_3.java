package Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Sample_Annotation_3 {
	@Test
	public void Demo1()
	{
System.out.println("1");
	}
	
	@AfterSuite
	public void Demo2()
	{
		System.out.println("2");
	}
	
	
	@BeforeSuite
	public void Demo3()
	{
		System.out.println("3");
	}
	
	
	@BeforeMethod
	public void Demo4()
	{
		System.out.println("4");
	}
	

	
	@BeforeClass
	public void Demo5()
	{
		System.out.println("5");
	}
	
	
	@BeforeSuite
	public void Demo6()
	{
		System.out.println("6");
	}
	
	
	
	
	@AfterMethod
	public void Demo7()
	{
		System.out.println("7");
	}
	
	
}
