package HMS_validate;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Validation_Commands {
	WebDriver driver;
  @Test
  public void f() {
	 // if(driver.findElement(By.name("username")).isDisplayed());
	 // {
		 // System.out.println("Available");
	 // }else{
		//  System.out.println("Not Available");
		  
	//	  {
			 
		  
	 try{
		  driver.findElement(By.name("username")).isDisplayed();
		  System.out.println("Available");
	  }catch(Exception e){
		  System.out.println("Not Available");
	  }
  }

@BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.get("http://selenium4testing.com/hms/");
  }

  @AfterTest
  public void afterTest() {
  }

}
