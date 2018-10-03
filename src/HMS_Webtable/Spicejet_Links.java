package HMS_Webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Spicejet_Links {
	WebDriver driver;
  @Test
  public void link_prints() {
	 String str= driver.findElement(By.xpath(".//*[@id='mainContents']/div[3]")).getText();
	 System.out.println(str);
	 String[] s=str.split("/n");
	 System.out.println(str.length());
	 
	  
  }
  

@BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.get("http://spicejet.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
