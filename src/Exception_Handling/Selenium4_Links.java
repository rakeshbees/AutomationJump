package Exception_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Selenium4_Links {
	WebDriver driver;
  @Test
  public void f() throws Exception {
		driver.findElement(By.linkText("New Batches")).click();
		Thread.sleep(2000);
		try {
			driver.findElement(By.linkText("Manual abcf")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Selenium FAQs")).click();
		Thread.sleep(2000);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","D:\\Library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("http://selenium4testing.com/");
	  driver.findElement(By.id("closediv")).click();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
