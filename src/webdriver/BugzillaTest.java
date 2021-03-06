package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BugzillaTest {
	private WebDriver driver;
	
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void openURL(){
		driver.get("http://selenium4testing.com/");
		driver.findElement(By.id("closediv")).click();
	}
	public void bugzilla(){
		driver.findElement(By.linkText("Bugzilla")).click();
		driver.navigate().to("http://www.way2testingtools.com/");
		driver.findElement(By.id("Bugzilla_login")).sendKeys("testingse2@gmail.com");
		driver.findElement(By.id("Bugzilla_password")).sendKeys("selenium");
		driver.findElement(By.id("log_in")).click();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BugzillaTest b=new BugzillaTest();
		b.openBrowser();
		b.openURL();
		b.bugzilla();
	}

}
