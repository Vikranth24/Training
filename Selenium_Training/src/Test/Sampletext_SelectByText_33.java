package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sampletext_SelectByText_33
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");//if it is wrong it will give illigal State Exception.qw
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/books");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("BOOKS")).click();
	 WebElement Drop=driver.findElement(By.xpath("//select[@id='products-orderby']"));
	   Select Dropdown=new Select(Drop); 
	   List<WebElement> Option=Dropdown.getOptions();
	for(WebElement dis: Option )
	{
		System.out.println(dis.getText());
		
	}
	  Select Dropdown1=new Select(Drop); 
	   List<WebElement> Option1=Dropdown1.getOptions();
	   for(int i=0;i<Option1.size();i++)
	   {
		   System.out.println(Option1.get(i).getText());
	   }
	   driver.close();
	

    
   // Dropdown.selectByIndex(5);
    
    //Thread.sleep(3000);

}}
