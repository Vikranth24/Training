package Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Samplrtest_findElement_7
{
	
		public static void main(String[] args) throws InterruptedException, IOException
		{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://scube.me/");
		String a=driver.getTitle();
		System.out.println(a);
		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
		WebElement register1=driver.findElement(By.xpath("//a[@class='block p-4']"));
		register1.click();
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
	//	act.sendKeys(Keys.PAGE_DOWN).perform();
	//	Thread.sleep(2000);
		
	
		/*act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);*/
		
		//WebElement register=driver.findElement(By.xpath("(//a[@rel='noreferrer'])[3]"));
		//register.click();
		//WebElement register=driver.findElement(By.xpath("//span[@class='ml-4 md:text-sm lg:text-base text-right inline-block cursor-pointer relative text-white']"));
		//register.click();
		
		//WebElement register1=driver.findElement(By.xpath("(//input[@id=\"name\"])[1]"));
		//register1.sendKeys("vikram");
		
}}

