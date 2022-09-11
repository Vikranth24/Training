package Frame;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import Utility_Package.Utility_Methods;

public class Sample_Utility_Method {@DataProvider(name="Data")
public Object[][] Test() throws IOException
{
	Object[][] data=new Object[1][5];
    data[0][0]=Utility_Methods.Test_Configration("Name");
	data[0][1]=Utility_Methods.Test_Configration("Lname");
	data[0][2]=Utility_Methods.Test_Configration("Email");
	data[0][3]=Utility_Methods.Test_Configration("PWD");
	data[0][4]=Utility_Methods.Test_Configration("CPWD");

	

	return data;
	
}

@org.testng.annotations.Test(dataProvider="Data")
public void Tests(String Name, String Lname,String Email,String PWD,String CPWD) throws IOException
{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(Utility_Methods.Test_Configration("URL"));
	driver.manage().window().maximize();
	
	driver.findElement(By.partialLinkText("Reg")).click();
	driver.findElement(By.name("FirstName")).sendKeys(Name);
	driver.findElement(By.id("LastName")).sendKeys(Lname);
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.name("Email")).sendKeys(Email);
	driver.findElement(By.name("Password")).sendKeys(PWD);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(CPWD);
	driver.findElement(By.id("register-button")).click();
	driver.close();
	System.out.println(Name);
	System.out.println(Lname);
	System.out.println(Email);
	System.out.println(PWD);
	System.out.println(CPWD);
	System.out.println();
	System.out.println("********************");
}

}



