package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sampletest_Myntra_Action_37 {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");//if it is wrong it will give illigal State Exception.qw
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//a[@data-group='men']"))).build().perform();

	act.moveToElement(driver.findElement(By.linkText("T-Shirts"))).click().perform();//for click build() is not necessary
	

}
}