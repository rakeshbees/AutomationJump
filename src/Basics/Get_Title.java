package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Get_Title {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  String x=driver.getTitle();
	  System.out.println(x);
	  Thread.sleep(2000);
	  driver.close();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.google.co.in");
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
  }

}
