package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest_55 {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]")).sendKeys("puma");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//li[text()='Puma Ferrari Shoes']")).click();
	
}
}