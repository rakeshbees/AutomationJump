package Spicejet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Dropdown_Default_Value {
	WebDriver driver;
	
  @Test
  public void f() {
	  WebElement e=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).getFirstSelectedOption();
	  System.out.println(e.getText());
	  if(e.getText().equalsIgnoreCase("1 Adult"))
	  {
		  System.out.println("Default value is 1 Adult");
	  }else{
		  System.out.println("Default value is not 1 Adult");
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.get("http://www.spicejet.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
