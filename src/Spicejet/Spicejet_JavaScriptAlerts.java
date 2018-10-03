package Spicejet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_JavaScriptAlerts {
	WebDriver driver;
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
	public void openURL(){
		driver.get("http://spicejet.com/");
	}
	public void search()throws Exception{
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		driver.findElement(By.linkText("22")).click();
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("7 Adults");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("3 Children");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("1 Infant");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(2000);

		}
	public void alert(){
		String str;
		str=driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().alert().accept();
			
			
   }
	
	
	
	

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Spicejet_JavaScriptAlerts s=new Spicejet_JavaScriptAlerts();
		s.openBrowser();
		s.openURL();
		s.search();
		s.alert();
		
		
		

	}

}
