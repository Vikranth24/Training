package Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class New {

	  public static void main(String[] args) {
		  ExtentReports report=new ExtentReports("./Reports/Extent.html");
		  ExtentTest extentTest=report.startTest("New");
		  System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.zomato.com");
		  driver.manage().window().maximize();
		  String title="Zomato";
		  if(driver.getTitle().contains(title))
		  {
			  extentTest.log(LogStatus.PASS, "Test Passed");
		  }
		  else
		  {
			  System.out.println("fail");
		  }
		  report .endTest(extentTest);
		  report.flush();
	  }
	       
}
