package Exe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility_Package.Base_Test;

public class Login extends Base_Test{
	@DataProvider(name="Data")
	public Object[][] Test1()
	{
		Object[][] data=new Object[1][2];
	    data[0][0]="Vikram24@gmail.com";
		data[0][1]="Nba241119!@#$";
		return data;
	}
		
	@Test(dataProvider="Data")
	public void Login1(String Fname, String pwd)

	{
		
		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		
		
		driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys(Fname);
		

		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name=\"RememberMe\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
		
}}       