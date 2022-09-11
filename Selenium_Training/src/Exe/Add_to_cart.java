package Exe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Add_to_cart {
	@Test
	public void Login1() throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value=\"Search store\"]")).sendKeys("COMPUTER");
		
		
		driver.findElement(By.xpath("//input[@class=\"button-1 search-box-button\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Add to cart\"]")).click();
Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class=\"button-1 add-to-cart-button\"]")).click();
		Thread.sleep(5000);
		driver.close();
}}       


