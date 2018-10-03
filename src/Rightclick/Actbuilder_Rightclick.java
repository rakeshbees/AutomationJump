package Rightclick;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actbuilder_Rightclick {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://in.yahoo.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
WebElement cricket= driver.findElement(By.xpath("//ul[@class='fz-xs']/li[4]"));
Actions action=new Actions(driver);


//Short form
action.contextClick(cricket).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();

action.moveToElement(cricket).contextClick().sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();


	}

}
