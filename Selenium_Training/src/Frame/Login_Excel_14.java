package Frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class Login_Excel_14 extends  Work_with_exe_13
{

	
	
	@DataProvider(name="Data")
	public Object[][] Test5() throws IOException
	{
		
	
		FileInputStream fil=new FileInputStream("./Test_Data\\Excel Worksheet.xlsx");
		Workbook book=new XSSFWorkbook(fil);
		Sheet sheet=book.getSheet("Sheet1");
		
		Object[][] data=new Object[a-1][b];
		int k=0;
		
		
		
		 for(int i=1;i<a;i++)
		    {
		    	for(int j=0; j<b;j++)
		    	{
		    		 data[k][j]=(sheet.getRow(i).getCell(j).getStringCellValue());
		    		 
		    		
		    	}
		    	k++;
		    	
		    	}
	    
		return data;
	}
		
	@Test(dataProvider="Data")
	public void Login1(String Fname, String pwd)

	{
		System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com");
			driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		
		
		driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys(Fname);
		

		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name=\"RememberMe\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
		driver.quit();
		
}}       


