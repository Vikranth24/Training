package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest_xpath_cssselector_25
{
	public static void main(String[] args) throws InterruptedException
	
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://a.testaddressbook.com/sign_up");
	driver.manage().window().maximize();
	//html/body/div[4]/div[1]/div[4]/div[3]/div[1]/div[1]/div[3]/div[5]/div[1]/div[2]/div[3]/div[2]/input

	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vikram241119@gmail.com");
	driver.findElement(By.cssSelector("input#user_password")).sendKeys("Nba241119!@#$");
	driver.findElement(By.xpath("//input[@value='Sign up']")).click();
	

}}


