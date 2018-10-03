package Web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AjaxControlNew {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.id("lst-ib")).sendKeys("selenium ");
	  Thread.sleep(2000);
	  String str;
	  String loc="//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul";
str=driver.findElement(By.xpath(loc)).getText();
System.out.println(str);
	String[] s=str.split("\n");
	System.out.println(s.length);
	for (int i = 0; i < s.length; i++) {
		if(s[i].contains("selenium tutorial"))
		{
			System.out.println(s[i]);
			driver.findElement(By.id("lst-ib")).clear();
			driver.findElement(By.id("lst-ib")).sendKeys(s[i]);
		}
	}
  }
  
  @BeforeClass
  public void beforeClass() {
		 System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();	
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://google.co.in");	
  }

  @AfterClass
  public void afterClass() {
  }

}
