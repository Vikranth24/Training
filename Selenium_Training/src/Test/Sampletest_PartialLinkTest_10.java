package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest_PartialLinkTest_10
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.partialLinkText("R")).click();
	driver.findElement(By.name("FirstName")).sendKeys("Vikranth");
	driver.findElement(By.id("LastName")).sendKeys("N");
	
	
	
	
	
	
	
	
	
	}

}
