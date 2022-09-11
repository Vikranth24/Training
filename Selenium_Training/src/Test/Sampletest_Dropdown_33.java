package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sampletest_Dropdown_33 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");//if it is wrong it will give illigal State Exception.qw
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("BOOKS")).click();
		WebElement nnn=driver.findElement(By.xpath("//select[(@id='products-orderby')]"));
		Select Dropdown=new Select(nnn);
		Dropdown.selectByIndex(0);

		Thread.sleep(3000);

		WebElement nnnn=driver.findElement(By.xpath("//select[(@id='products-orderby')]"));
		Select Dropdown1=new Select(nnnn);
		Dropdown1.selectByIndex(1);

		Thread.sleep(3000);

		WebElement mmm=driver.findElement(By.xpath("//select[(@id='products-orderby')]"));
		Select Dropdown2=new Select(mmm);
		Dropdown2.selectByIndex(2);
		Thread.sleep(3000);


		WebElement mmm1=driver.findElement(By.xpath("//select[(@id='products-orderby')]"));
		Select Dropdown3=new Select(mmm1);
		Dropdown3.selectByIndex(3);
		Thread.sleep(3000);


		WebElement mmm2=driver.findElement(By.xpath("//select[(@id='products-orderby')]"));
		Select Dropdown4=new Select(mmm2);
		Dropdown4.selectByIndex(4);
		Thread.sleep(3000);

		WebElement mmm3=driver.findElement(By.xpath("//select[(@id='products-orderby')]"));
		Select Dropdown5=new Select(mmm3);
		Dropdown5.selectByIndex(5);
	}}
