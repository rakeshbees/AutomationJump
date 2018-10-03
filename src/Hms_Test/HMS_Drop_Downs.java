package Hms_Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HMS_Drop_Downs {
	WebDriver driver;
  @Test
  public void f() {
	  List<WebElement> str=driver.findElements(By.tagName("select"));
	   System.out.println(str.size());
	   for (int i = 0; i <str.size(); i++) 
	   {
		   System.out.println(str.get(i).getAttribute("name"));
		   
		
	}
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("http://selenium4testing.com/hms/");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  driver.findElement(By.linkText("Registration")).click();
	  driver.findElement(By.linkText("Permanent Registration")).click();
  }

  @AfterTest
  public void afterTest() {
  }

}
