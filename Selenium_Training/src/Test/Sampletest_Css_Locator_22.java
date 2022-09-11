package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest_Css_Locator_22
{
	public static void main(String[] args)

	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.cssSelector("a.ico-login")).click();
	driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("vikram2424@gmail.com");
	driver.findElement(By.cssSelector("input#Password")).sendKeys("Nba241119");
	driver.findElement(By.cssSelector("input#RememberMe")).click();
	driver.findElement(By.cssSelector("input[value='Log in']")).click();

}}
