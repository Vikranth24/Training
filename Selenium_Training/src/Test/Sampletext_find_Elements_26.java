package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletext_find_Elements_26
{
public static void main(String[] args) throws InterruptedException
	
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	List<WebElement> Element=driver.findElements(By.xpath("//img"));
	System.out.println(Element.size());
	for(WebElement Image:Element) 
	{
		System.out.println(Image.getText());
		
		
	}
		
	}

}
