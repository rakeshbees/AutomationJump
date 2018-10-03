package interviewquestion;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Hms_popup {
	WebDriver driver=new ChromeDriver();
  @Test
  public void f() {
	  driver.findElement(By.name("username")).click();
	  driver.findElement(By.name("password")).click();
	  driver.findElement(By.name("submit")).click();
	  driver.findElement(By.linkText("Feedback")).click();
	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\New folder\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("http://selenium4testing.com/hms/");
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
