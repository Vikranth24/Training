package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sampletext_Implicit_wait_54
{

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	WebDriverWait wait=new 	WebDriverWait(driver, 25);
	driver.findElement(By.partialLinkText("Reg"));
	driver.findElement(By.partialLinkText("Reg")).click();
	driver.findElement(By.name("FirstName")).sendKeys("Vikranth");
	driver.findElement(By.id("LastName")).sendKeys("N");
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.name("Email")).sendKeys("vikram2456117@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("Nba241119!@#$");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Nba241119!@#$");
	wait.until(ExpectedConditions.elementToBeClickable (driver.findElement(By.id("register-button")))).click();
	driver.findElement(By.id("Continue")).click();
	
}}



