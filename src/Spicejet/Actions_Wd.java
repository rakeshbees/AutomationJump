package Spicejet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Actions_Wd {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  Actions a=new Actions(driver);
	   WebElement e=driver.findElement(By.linkText("About Us"));
	   a.moveToElement(e).build().perform();
	   Thread.sleep(1000);
	   driver.findElement(By.linkText("Careers")).click();
	   
	   
	   a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	   Thread.sleep(1000);
	   a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	   
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.get("http://spicejet.com");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
