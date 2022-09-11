package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample_CrossBrowser_10 {
	@Test
	public void add()
	{
		System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
	
	
	driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys("vikram867@gmail.con");
	

	driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Nba241119!@#$");
	driver.findElement(By.xpath("//input[@name=\"RememberMe\"]")).click();
	driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
	driver.close();
}      

}
