package interviewquestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class Multiplewindow_popup {

	public static void main(String[] args) throws Exception {
  System.setProperty("webdriver.chrome.driver","E:\\New folder\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  driver.get("https://www.online.citibank.co.in/");
  driver.findElement(By.cssSelector("body > div.fancybox-overlay.fancybox-overlay-fixed > div > div > a")).click();
  Thread.sleep(2000);
  
  
  driver.findElement(By.xpath("//*[@id='container']/div[2]/div[2]/div/div[1]/div[1]/p[2]/a[1]/img")).click();
  String parentwindow=driver.getWindowHandle();
  for(String Subwindow:driver.getWindowHandles());
  {
	  driver.switchTo().window("Subwindow");
	  System.out.println(driver.findElement(By.xpath("//*[@id='User_Id']")).getText());
	  driver.close();
	  
	  driver.switchTo().window("parentwindow");
	  driver.close();
	  
  }
  
  
  }
  

	}


