package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sampletest_2 {


	
	
	
	
		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.applyuninow.com");
		
		
		
		}
	}


