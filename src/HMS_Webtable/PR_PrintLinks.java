package HMS_Webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PR_PrintLinks {
	WebDriver driver;
  @Test
  public void Print_Links() {
	 String str= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]")).getText();
	 System.out.println(str);
	 String[] s=str.split("/n");
	 System.out.println(s.length);
	 for (int i = 0; i < s.length; i++) {
		 if (s[i].contains("*")) {
			 System.out.println(s[i]);
			
		}
		
	}
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
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
