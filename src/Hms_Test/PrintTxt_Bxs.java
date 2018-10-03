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

public class PrintTxt_Bxs {
	WebDriver driver;
  @Test
  public void f() {
	  List<WebElement>s=driver.findElements(By.tagName("input "));
	  System.out.println(s.size());
	  for (int i = 0; i < s.size(); i++) 
	  {
		  if(s.get(i).getAttribute("type").equalsIgnoreCase("text"));
		  System.out.println(s.get(i).getAttribute("name"));
	  }
	
	//  else if(s.get(i).getAttribute("class").equalsIgnoreCase("log"))
	  {
		  //System.out.println("Btn Loc :"+s.get(i).getAttribute("value"));
	}
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
