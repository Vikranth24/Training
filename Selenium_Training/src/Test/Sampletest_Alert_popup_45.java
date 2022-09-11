package Test;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sampletest_Alert_popup_45
{public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","F:\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/simple_context_menu.html");

driver.manage().window().maximize();
Actions act=new Actions(driver);
act.moveToElement(driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"))).doubleClick().build().perform();
Alert a=driver.switchTo().alert();
String s=a.getText();
System.out.println(s);
Thread.sleep(2000);
a.accept();

}}
