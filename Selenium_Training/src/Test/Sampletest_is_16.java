package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest_is_16
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	
	WebElement  register_1=driver.findElement(By.partialLinkText("Reg"));
	boolean display1=register_1.isEnabled();
	System.out.println(display1);
	
	WebElement  register_2=driver.findElement(By.partialLinkText("Reg"));
	boolean display = register_2.isSelected();
	System.out.println(display);
	}

}
