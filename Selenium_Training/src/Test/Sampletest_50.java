package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class Sampletest_50 {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");

	driver.manage().window().maximize();
		String r=driver.getWindowHandle();
	
	Actions act=new Actions(driver);
	for(int i=0; i<=3;i++)
	{
	act.sendKeys(Keys.PAGE_DOWN).perform();
	Thread.sleep(2000);
	}

	driver.findElement(By.xpath("//a[@target='_blank']")).click();
	java.util.Set<String> b= driver.getWindowHandles();
	Thread.sleep(5000);
	
	for(String c: b)
	{
		if(!c.equals(r))
		{
		driver.switchTo().window(c);
		Thread.sleep(5000);
		driver.close();
		
	}}}
}
	
	/*String a=driver.getWindowHandle();
	System.out.println(a);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id='button1']")).click();
	
	System.out.println(b);
	for(String c: b)
	{
		driver.switchTo().window(c);
	
		driver.close();
		Thread.sleep(5000);*/
	/*public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(5000);
		
		java.util.Set<String> allWindows = driver.getWindowHandles();
		for(String w: allWindows) {
			
			if(!w.equals(parentWindow)) {
				
				driver.switchTo().window(w);
				driver.close();*/
			
		
		
	

