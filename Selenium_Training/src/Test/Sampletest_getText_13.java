package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest_getText_13
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	
	String register_link=driver.findElement(By.partialLinkText("Reg")).getText();
	System.out.println(register_link);
	
	
	String login_link=driver.findElement(By.partialLinkText("L")).getText();
	System.out.println(login_link);
	
	String Shoppingcart_link=driver.findElement(By.partialLinkText("Sho")).getText();
	System.out.println(Shoppingcart_link);
	
	String Wishlist_link=driver.findElement(By.partialLinkText("Wi")).getText();
	System.out.println( Wishlist_link);
	
	String Book_link=driver.findElement(By.partialLinkText("Books")).getText();
	System.out.println(Book_link);
	
	String Computer_link=driver.findElement(By.partialLinkText("Comp")).getText();
	System.out.println(Computer_link);
	
	String Giftcard_link=driver.findElement(By.partialLinkText("Gif")).getText();
	System.out.println(Giftcard_link);
	driver.close();
	}
}
	
	