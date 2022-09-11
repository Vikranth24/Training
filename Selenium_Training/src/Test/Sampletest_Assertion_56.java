package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sampletest_Assertion_56 {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	Assert.assertEquals(driver.getTitle(),"Demo Web Shop", "Hai       ...");
	Assert.assertEquals(driver.findElement(By.linkText("Register")).isDisplayed(), false);
	
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.name("FirstName")).sendKeys("Vikranth");
	driver.findElement(By.id("LastName")).sendKeys("N");
	System.out.println(driver.getTitle());
	driver.close();
	
	

}}
