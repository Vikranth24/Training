package Exe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Wishlist {
	@Test
	public void Login1() throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("DIGITAL DOWNLOADS")).click();
		
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='3rd Album']")).click();
		driver.findElement(By.xpath("//input[@id=\"add-to-wishlist-button-53\"]")).click();
		driver.close();
}
}