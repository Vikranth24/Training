package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sampletext_Rightclick_42 {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	
	act.contextClick(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"))).build().perform();
	act.moveToElement(driver.findElement(By.xpath("//span[text()='Cut']"))).click().build().perform();
	
	

}}
//Drag and drop, click and hold