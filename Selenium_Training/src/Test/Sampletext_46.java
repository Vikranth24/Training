package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sampletext_46 {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");

	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).build().perform();
	act.moveToElement(driver.findElement(By.xpath("//span[text()='Edit']"))).click().build().perform();
	Alert a=driver.switchTo().alert();
	String s=a.getText();
	System.out.println(s);
	Thread.sleep(2000);
	a.accept();
	
	
	act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).build().perform();
	act.moveToElement(driver.findElement(By.xpath("//span[text()='Cut']"))).click().build().perform();
	Alert a1=driver.switchTo().alert();
	String s1=a.getText();
	System.out.println(s1);
	Thread.sleep(2000);
	a1.accept();
	

}
}