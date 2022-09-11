package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest_Add_to_Cart_21 {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("user-name")).sendKeys("problem_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	driver.findElement(By.name("login-button")).click();
	driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	driver.findElement(By.className("shopping_cart_link")).click();
	

}}
