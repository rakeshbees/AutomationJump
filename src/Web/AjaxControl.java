package Web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AjaxControl {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	  Thread.sleep(2000);
	  String str;
	  //String loc=""
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("https://google.co.in");
  }

  @AfterTest
  public void afterTest() {
  }

}
