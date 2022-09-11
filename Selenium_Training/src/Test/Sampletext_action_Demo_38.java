package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sampletext_action_Demo_38
{public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");//if it is wrong it will give illigal State Exception.qw
WebDriver driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/");
driver.manage().window().maximize();
Actions act=new Actions(driver);
act.moveToElement(driver.findElement(By.linkText("COMPUTERS"))).build().perform();

act.moveToElement(driver.findElement(By.linkText("Desktops"))).click().build().perform();//for click build() is not necessary


}

}

