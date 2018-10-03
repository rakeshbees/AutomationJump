package Erp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ERP_Login {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.xpath("//div[@id='topbar']/div/div/div[4]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='submitLogin']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.get("http://demo.inoideas.org/");
  }

  @AfterTest
  public void afterTest() throws Exception {
	  driver.quit();
	  Thread.sleep(2000);
  }

}
