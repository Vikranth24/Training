
package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32//chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://chromedriver.storage.googleapis.com/index.html?path=96.0.4664.45/");
	driver.get("https://google.co.in");
	
	}
}
