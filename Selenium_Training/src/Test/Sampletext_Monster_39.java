package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sampletext_Monster_39 {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");//if it is wrong it will give illigal State Exception.qw
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.monsterindia.com/");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//a[@data-check='menutab']"))).build().perform();

	act.moveToElement(driver.findElement(By.linkText("JOBS BY SKILLS"))).build().perform();
	//act.moveToElement(driver.findElement(By.xpath("//a[@class='accordion-header']"))).build().perform();

	act.moveToElement(driver.findElement(By.partialLinkText("JAVA JOBS"))).click().build().perform();

	}

}
