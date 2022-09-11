package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sampletest_Explicit_Wait_53
{

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	
	WebDriverWait wait=new 	WebDriverWait(driver, 25);
	
	wait.until(ExpectedConditions.elementToBeClickable (driver.findElement(By.partialLinkText("Reg"))));
	driver.findElement(By.partialLinkText("Reg")).click();
	driver.findElement(By.name("FirstName")).sendKeys("Vikranth");
	driver.findElement(By.id("LastName")).sendKeys("N");
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.name("Email")).sendKeys("vikram24567@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("Nba241119!@#$");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Nba241119!@#$");
	wait.until(ExpectedConditions.elementToBeClickable (driver.findElement(By.id("register-button")))).click();
	driver.findElement(By.id("Continue")).click();
	
}}
