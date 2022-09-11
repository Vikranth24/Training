package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest_register_indepth_17
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	
	WebElement  register_1=driver.findElement(By.partialLinkText("Reg"));
	boolean display1=register_1.isEnabled();
	System.out.println(display1);
	boolean display2 = register_1.isSelected();
	System.out.println(display2);
	boolean display3=register_1.isDisplayed();
	System.out.println(display3);
	register_1.click();
	driver.findElement(By.name("FirstName")).sendKeys("Vikrant");
	driver.findElement(By.id("LastName")).sendKeys("r");
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.name("Email")).sendKeys("vikram2@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("Nba241119!@#$");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Nba241119!@#$");
	driver.findElement(By.id("register-button")).click();
	driver.findElement(By.id("Continue")).click();
}}
