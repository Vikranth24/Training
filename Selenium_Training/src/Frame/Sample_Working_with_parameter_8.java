package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample_Working_with_parameter_8 {
	@Parameters({"URL", "Email","PWD"})
	@Test
	public void Login1(String URL, String Email,String PWD)

	{
		System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		
		
		driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys(Email);
		
		//"http://demowebshop.tricentis.com"
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys(PWD);
		driver.findElement(By.xpath("//input[@name=\"RememberMe\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
		driver.close();// Parameter XML
}}       


