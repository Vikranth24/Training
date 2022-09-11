package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest_X_path_24
{
	public static void main(String[] args) throws InterruptedException

	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	//html/body/div[4]/div[1]/div[4]/div[3]/div[1]/div[1]/div[3]/div[5]/div[1]/div[2]/div[3]/div[2]/input

	driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	

}}
