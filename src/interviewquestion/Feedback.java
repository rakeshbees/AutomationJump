package interviewquestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Feedback {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("http://selenium4testing.com/hms/");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  
	  driver.findElement(By.linkText("Feedback")).click();
	  driver.switchTo().window("mywindow");
	  driver.findElement(By.id("name")).sendKeys("RUPAK");
	  driver.findElement(By.id("email")).sendKeys("rupak@gmail.com");
	  new Select(driver.findElement(By.id("car"))).selectByVisibleText("Mercedes");
	  driver.findElement(By.name("radio")).click();
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[5]/label/input")).click();
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[6]/input")).sendKeys("C:\\Users\\Rupak\\Desktop\\rupak..pasport.jpg");
	  driver.findElement(By.id("message")).sendKeys("Nagesh Sir is Best Sir In Selenium");
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/p/button[1]")).click();
	  driver.close();
			  
	  String mainwindow=driver.getWindowHandle();
	  driver.switchTo().window("mainwindow");
	  driver.findElement(By.linkText("ADT")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\New folder\\chromedriver.exe");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
