package googleInformation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DriverCommand;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class InformationCommands {
  WebDriver driver;

@Test
  public void f() {
	String str;
	str=driver.findElement(By.linkText("Gmail")).getText();
	System.out.println(str);
	String str1=driver.findElement(By.name("btnK")).getAttribute("value");
	System.out.println(str1);
	String tip=driver.findElement(By.id("hplogo")).getAttribute("title");
	System.out.println(tip);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   driver.get("https://.google.co.in");
	   
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
