package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest_Css_18
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	
	WebElement  register_111=driver.findElement(By.linkText("Register"));
	String Colo=register_111.getCssValue("color");
	System.out.println(Colo);

	WebElement  register_1111=driver.findElement(By.linkText("Register"));
	String Font=register_1111.getCssValue("font-size");
	System.out.println(Font);
	WebElement  register_11111=driver.findElement(By.linkText("Register"));
	String Float=register_11111.getCssValue("float");
	System.out.println(Float);

}
}