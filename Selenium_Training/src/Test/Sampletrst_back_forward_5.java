package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletrst_back_forward_5
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		
	}


}

