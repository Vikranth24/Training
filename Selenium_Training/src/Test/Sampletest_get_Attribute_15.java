
package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest_get_Attribute_15
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	
	WebElement  register_=driver.findElement(By.partialLinkText("Reg"));
	String value=register_.getAttribute("class");
	System.out.println(value);

	
	String value1=driver.findElement(By.name("q")).getAttribute("value");
	
	System.out.println(value1);
	driver.findElement(By.name("q")).sendKeys("off");

	String value_1=driver.findElement(By.name("q")).getAttribute("value");
	System.out.println(value_1);
	
	
	
	
	}}
	

	
	
	
