package Frame;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility_Package.Utility_Methods;

public class Sample_Utility_Sample_7 {
	@DataProvider(name="Data")
	public Object[][] Test1() throws IOException
	{
		Object[][] data=new Object[1][2];
	    data[0][0]=Utility_Methods.Test_Configration("Email");
		data[0][1]=Utility_Methods.Test_Configration("PWD");
		return data;
	}
		
	@Test(dataProvider="Data")
	public void Login1(String Email, String PWD) throws IOException, InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(Utility_Methods.Test_Configration("URL"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		
		
		WebElement element1=driver.findElement(By.xpath("//input[@class=\"email\"]"));
		  Utility_Methods.Send_keys(element1,Email);

		  WebElement element2=driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		  Utility_Methods.Send_keys(element2,PWD);
		  WebElement element3=driver.findElement(By.xpath("//input[@name=\"RememberMe\"]"));
		  Utility_Methods. click(element3);
		  WebElement element4=driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]"));
		  Utility_Methods. click(element4);
		  Thread.sleep(5000);
		driver.close();
}
	

}       


