package Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample_2 {
	@Test
	public void Demo12()
	{
System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com");
	
	}
}
