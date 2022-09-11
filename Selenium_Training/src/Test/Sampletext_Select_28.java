package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletext_Select_28 {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Books")).click();
	List<WebElement> Element=driver.findElements(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']"));
			
	System.out.println(Element.size());
	for(WebElement Image:Element) 
	{
		Image.click();
		Thread.sleep(4000);
		
	}
	driver.findElement(By.partialLinkText("Shop")).click();
	

}
}