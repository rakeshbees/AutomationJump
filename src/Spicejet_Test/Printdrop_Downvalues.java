package Spicejet_Test;

import java.util.ArrayList;
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

public class Printdrop_Downvalues {
	WebDriver driver;
  @Test
  public void f() {
	  String id="ctl00_mainContent_ddl_Adult";
	  List<WebElement> str=new ArrayList<WebElement>();
	  str=new Select(driver.findElement(By.id(id))).getOptions();
	  System.out.println(str.size());
	  
	
  }
  @BeforeTest
  public void beforeTest() {

	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://spicejet.com");
  }

  @AfterTest
  public void afterTest() {
  }

}
