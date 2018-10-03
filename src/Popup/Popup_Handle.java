package Popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Popup_Handle {
	WebDriver driver;
	public void openbrowser(){
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	public void openurl(){
		driver.get("http://selenium4testing.com/hms");
	}
	public void login(){
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
	}
	public void popup() throws Exception{
		 String mainWindow=driver.getWindowHandle();
		 driver.findElement(By.linkText("Feedback")).click();
		  Set<String>str=driver.getWindowHandles();
		  System.out.println(str);
		  Object[] s=str.toArray();
		  driver.switchTo().window(s[1].toString());
		  Thread.sleep(2000);
		  driver.findElement(By.id("name")).sendKeys("Rupak");
		  driver.findElement(By.id("email")).sendKeys("secrupak@gmail.com");
		   new Select(driver.findElement(By.id("car"))).selectByVisibleText("Volvo");
		   Thread.sleep(1000);
		   driver.close();
		   
		   
		   driver.switchTo().window(s[0].toString());
		   driver.findElement(By.linkText("ADT")).click();
		   
		  
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Popup_Handle ph=new Popup_Handle();
		ph.openbrowser();
		ph.openurl();
		ph.login();
		ph.popup();
		

	}

}
