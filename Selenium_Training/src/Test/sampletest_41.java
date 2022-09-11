package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sampletest_41 {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","F:\\Chrome/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	driver.findElement(By.partialLinkText("Log in")).click();
	
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vikram24@gmail.com");
	
	driver.findElement(By.id("Password")).sendKeys("Nba241119!@#$");
	
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	driver.findElement(By.linkText("JEWELRY")).click();
	WebElement nnn=driver.findElement(By.xpath("//select[@id='products-viewmode']"));
	 Select Dropdown=new Select(nnn);
	    Dropdown.selectByIndex(1);
	    driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
}
}