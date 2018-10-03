package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Contain_http {
	WebDriver driver;
  @Test
  public void f() {
	String x=driver.getCurrentUrl();
	  if(x.contains("https"))
	  {
	 System.out.println("securable site");
	  }else{
		  System.out.println();
	  }
			  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.gmail.com");
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
