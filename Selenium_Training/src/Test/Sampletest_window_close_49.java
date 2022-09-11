

package Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class Sampletest_window_close_49 {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://tutorialshut.com/demo-website-for-selenium-automation-practice/");

	driver.manage().window().maximize();
	String a=driver.getWindowHandle();
	System.out.println(a);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id='button1']")).click();
	java.util.Set<String> b= driver.getWindowHandles();
	System.out.println(b);
	for(String c: b)
	{
		driver.switchTo().window(c);
	
		driver.close();
		Thread.sleep(5000);
		
	}
	
	
}}








