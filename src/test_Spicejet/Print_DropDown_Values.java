package test_Spicejet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Print_DropDown_Values {
	WebDriver driver;
  @Test
  public void f() {
	  List<WebElement>s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).getOptions();
	  System.out.println(s.size());
	  for (int i = 0; i <s.size(); i++) {
		  //To print and select 5adults
		  if(s.get(i).getText().equalsIgnoreCase("5 Adults"));
		  {
			  System.out.println(s.get(i).getText());
			  new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText(s.get(i).getText());
		  }
		  //To print all values except5 adults
		  if (!s.get(i).getText().equalsIgnoreCase("5 Adults"));
		  {
			  System.out.println(s.get(i).getText());
			  
		  }
		
	}
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("http://www.spicejet.com/");
	  
  }

}
