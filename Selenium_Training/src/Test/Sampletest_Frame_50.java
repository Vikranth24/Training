package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest_Frame_50 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Vikranth/Downloads/iframe.html");

	driver.manage().window().maximize();
	driver.switchTo().frame("frame1");
	
	driver.findElement(By.xpath("//a[text()='CRICKET']")).click();
}}