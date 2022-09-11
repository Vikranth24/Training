package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sampletext_action_36 {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");//if it is wrong it will give illigal State Exception.qw
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.linkText("COMPUTERS"))).build().perform();
	act.moveToElement(driver.findElement(By.partialLinkText("Desk"))).click().build().perform();
	
	
	
	
}}







