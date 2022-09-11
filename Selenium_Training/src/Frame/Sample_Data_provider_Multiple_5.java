package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Sample_Data_provider_Multiple_5 {
	@DataProvider(name="Data")
	public Object[][] Test()
	{
		Object[][] data=new Object[2][5];
	    data[0][0]="Vikranth";
		data[0][1]="N";
		data[0][2]="vikram456@gmail.com";
		data[0][3]="Nba241119!@#$";
		data[0][4]="Nba241119!@#$";
		
		
		data[1][0]="Vikranth";
		data[1][1]="N";
		data[1][2]="vikram456123@gmail.com";
		data[1][3]="Nba241119!@#$";
		data[1][4]="Nba241119!@#$";
		return data;
		
	}
	
	@org.testng.annotations.Test(dataProvider="Data")
	public void Tests(String firstname, String lname,String Email,String PWD,String CPWD)
	{
		System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Reg")).click();
		driver.findElement(By.name("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lname);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("Email")).sendKeys(Email);
		driver.findElement(By.name("Password")).sendKeys(PWD);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(CPWD);
		driver.findElement(By.id("register-button")).click();
		driver.close();
		System.out.println(firstname);
		System.out.println(lname);
		System.out.println(Email);
		System.out.println(PWD);
		System.out.println(CPWD);
		System.out.println();
		System.out.println("********************");
	}

}
