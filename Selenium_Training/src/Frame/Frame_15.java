package Frame;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility_Package.Base_Test;
import Utility_Package.Utility_Methods;

public class Frame_15 extends Base_Test
{

	
	
	@DataProvider(name="Data")
	public Object[][] Test5() throws IOException
	{
		Object[][] dat= Utility_Methods.Data("Sheet1");
	
		
	    
		return dat;
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



	


