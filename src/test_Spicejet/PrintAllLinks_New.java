package test_Spicejet;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PrintAllLinks_New {
	WebDriver driver;
  @Test
  public void f() {
	//  String[] s=new String[100];
	 // List<String> s1=new ArrayList<String>();
	  
	  
	List<WebElement> str=driver.findElements(By.tagName("a"));
	System.out.println(str.size());
  }
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://spicejet.com");	
		
			
		}
  

  @AfterTest
  public void afterTest() {
  }

}
