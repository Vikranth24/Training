package Exe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility_Package.Base_Test;

public class Search extends Base_Test{
	@DataProvider(name="Data")
	public Object[][] Test1()
	{
		Object[][] data=new Object[1][1];
	    data[0][0]="COMPUTERS";
		
		return data;
	}

	@Test(dataProvider="Data")
	public void Login1(String c)

	{
		driver.findElement(By.xpath("//input[@value=\"Search store\"]")).sendKeys(c);
		
		
		driver.findElement(By.xpath("//input[@class=\"button-1 search-box-button\"]")).click();
		

		
		
}}       
