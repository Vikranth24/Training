
package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest_working_with_locator_8
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
		driver.findElement(By.className("button-1 search-box-button")).click();
		driver.close();
		driver.quit();
		
			
	}

}
