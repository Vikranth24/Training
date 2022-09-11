package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sampletest_Dropdown_31
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");//if it is wrong it will give illigal State Exception.qw
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("BOOKS")).click();
	WebElement nnn=driver.findElement(By.xpath("//select[(@id='products-pagesize')]"));
    Select Dropdown=new Select(nnn);
    Dropdown.selectByIndex(2);
    


}}
