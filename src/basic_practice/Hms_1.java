package basic_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Hms_1 {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	 // driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	  driver.findElement(By.name("txtUsername")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@name='Submit']")).click();
	  Thread.sleep(3000);
	  
	  
  }
  @BeforeTest//pre condition
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	  
  }

  @AfterTest//post condition
  public void afterTest() {
  }

}
