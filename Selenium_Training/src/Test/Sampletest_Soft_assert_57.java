package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sampletest_Soft_assert_57 {
	@Test
	public static void add()
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	SoftAssert a=new SoftAssert();
	a.assertEquals(driver.getTitle(),"Demo Web Shoppp", "Hai       ...");
	
	//Assert.assertEquals(driver.findElement(By.linkText("Register")).isDisplayed(), false);     // Hard Assertion
	
	
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.name("FirstName")).sendKeys("Vikranth");
	driver.findElement(By.id("LastName")).sendKeys("N");
	System.out.println(driver.getTitle());
	driver.close();
	a.assertAll();
	


}}
