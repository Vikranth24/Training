package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sampletext_Demo_40 {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.partialLinkText("Reg")).click();
	driver.findElement(By.name("FirstName")).sendKeys("Vikrnth");
	driver.findElement(By.id("LastName")).sendKeys("t");
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.name("Email")).sendKeys("vikram2421177@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("Nba241119!@#$");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Nba241119!@#$");
	driver.findElement(By.id("register-button")).click();
	driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.linkText("COMPUTERS"))).build().perform();

	act.moveToElement(driver.findElement(By.linkText("Desktops"))).click().build().perform();//for click build() is not necessary
	WebElement nnn=driver.findElement(By.id("products-orderby"));
    Select Dropdown=new Select(nnn);
    Dropdown.selectByIndex(3);
    driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
    
    driver.findElement(By.linkText("Log out")).click();

    
	}

}
