package Rightclick;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_ClickAction {

	public static void main(String[] args) throws Exception {
    System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.co.in");
    driver.manage().window().maximize();
    //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
     WebElement link= driver.findElement(By.className("_Gs"));
     Actions actions=new Actions(driver);
     actions.contextClick(link).perform();
     Thread.sleep(2000);
    // actions.sendKeys("t").perform();
    // Thread.sleep(5000);
    
    
    
	}

}
