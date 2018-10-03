package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HMS_Popup {
 private WebDriver driver;
 public void openBrowser(){
	 System.setProperty("webdriver.chrome.driver","E:\\New folder\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
 }
 public void openURL(){
	 driver.get("http://selenium4testing.com/hms/");
 }
 public void login(){
	 driver.findElement(By.name("username")).sendKeys("admin");
	 driver.findElement(By.name("password")).sendKeys("admin");
	 driver.findElement(By.name("submit")).click();
 }
 public void popup()throws Exception{
	 String mainwindow=driver.getWindowHandle();
	 
	 
	 driver.findElement(By.linkText("Feedback")).click();
	 driver.switchTo().window("mywindow");
	 Thread.sleep(2000);
	 driver.findElement(By.id("name")).sendKeys("Selenium");
	 driver.findElement(By.id("email")).sendKeys("secrupak@gmail.com");
	 new Select(driver.findElement(By.id("car"))).selectByVisibleText("Mercedes");
	 Thread.sleep(2000);
	 driver.close();
	 

		driver.switchTo().window(mainwindow);
	 driver.findElement(By.linkText("ADT")).click();
 }
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		HMS_Popup h=new HMS_Popup();
		h.openBrowser();
		h.openURL();
		h.login();
		h.popup();
		

	}

}
