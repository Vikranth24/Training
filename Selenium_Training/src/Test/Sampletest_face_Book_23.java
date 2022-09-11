package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest_face_Book_23 
{
	public static void main(String[] args) throws InterruptedException

	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Vikranth");
	driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("N");
	//driver.findElement(By.cssSelector("a[name='reg_email__']")).sendKeys("9900234737");
//	driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("Nba241119!@#$");

	driver.findElement(By.id("day")).click();
	/*driver.findElement(By.cssSelector("a[dir='ltr']")).sendKeys("Vikranth");
	driver.findElement(By.cssSelector("a[name='lastname']")).sendKeys("N");
	driver.findElement(By.cssSelector("a[name='reg_email__']")).sendKeys("9900234737");
	driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("Nba241119!@#$");*/

}}


