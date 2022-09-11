package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sampletext_35 {
	public static void main(String[] args) throws InterruptedException
	{
		String s="Created on";
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");//if it is wrong it will give illigal State Exception.qw
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/books");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("BOOKS")).click();
	 WebElement Drop=driver.findElement(By.xpath("//select[@id='products-orderby']"));
	   
	 Select Dropdown1=new Select(Drop); 
	   List<WebElement> Option1=Dropdown1.getOptions();
	   for(int i=0;i<Option1.size();i++)
	   {
		   if(Option1.get(i).getText().equals(s))
		   System.out.println(i);
	   }
	   driver.close();

}

} 