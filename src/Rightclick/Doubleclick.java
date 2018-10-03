package Rightclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws Exception {
    System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.co.in");
    driver.manage().window().maximize();
    
    
    Actions action=new Actions(driver);
    action.moveToElement(driver.findElement(By.xpath("//input[@name='btnI']"))).doubleClick().perform();
    Thread.sleep(4000);
	}

}
