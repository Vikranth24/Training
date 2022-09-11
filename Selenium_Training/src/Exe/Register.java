package Exe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility_Package.Base_Test;
public class Register extends Base_Test 
{
	@DataProvider (name="Data")
	public Object[][] Test()
	{
		Object[][] data=new Object[1][5];
	    data[0][0]="Vikranth";
		data[0][1]="N";
		data[0][2]="vikram45654@gmail.com";
		data[0][3]="Nba241119!@#$";
		data[0][4]="Nba241119!@#$";
		return data;
		
		
		
	}
	
	@Test(dataProvider="Data")
	public void Tests(String firstname, String lname,String Email,String PWD,String CPWD)
	{
		
		
		driver.findElement(By.partialLinkText("Reg")).click();
		driver.findElement(By.name("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lname);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("Email")).sendKeys(Email);
		driver.findElement(By.name("Password")).sendKeys(PWD);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(CPWD);
		driver.findElement(By.id("register-button")).click();
	
	

}}
