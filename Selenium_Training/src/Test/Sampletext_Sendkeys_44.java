package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sampletext_Sendkeys_44 
{

public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/");
driver.manage().window().maximize();
Actions act=new Actions(driver);
act.sendKeys(driver.findElement(By.xpath("//input[@class=\"search-box-text ui-autocomplete-input\"]")), "Computers").perform();
Thread.sleep(2000);
act.moveToElement(driver.findElement(By.xpath("//input[@class=\"search-box-text ui-autocomplete-input\"]"))).click()
.keyDown(Keys.SHIFT).sendKeys("Computers").keyUp(Keys.SHIFT).perform();
}}
