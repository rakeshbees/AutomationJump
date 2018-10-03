package OpenURL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4links {
	private WebDriver driver;
	
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	public void openURL(){
		driver.get("http://selenium4testing.com/");
		driver.findElement(By.id("closediv")).click();
	}
	public void mFAQs(){
		driver.findElement(By.linkText("Manual FAQs")).click();
	}
	public void sFAQs(){
		driver.findElement(By.linkText("Selenium FAQs")).click();
	}
	public void cFAQs(){
		driver.findElement(By.linkText("Core Java FAQs")).click();
	}
	public void gTFAQs(){
		driver.findElement(By.linkText("General Testing FAQs")).click();
	}
	public void downloads(){
		driver.findElement(By.linkText("Downloads")).click();
	}
	public void resumes(){
		driver.findElement(By.linkText("Resumes")).click();
	}
	public void videos(){
		driver.findElement(By.linkText("Videos")).click();
	}
	public void hms(){
		driver.findElement(By.linkText("HMS")).click();
	}
	public void bugzilla(){
		driver.findElement(By.linkText("Bugzilla")).click();
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Selenium4links s=new Selenium4links();
	s.openBrowser();
	s.openURL();
	s.mFAQs();
	s.sFAQs();
	s.cFAQs();
	s.gTFAQs();
	s.downloads();
	s.resumes();
	s.videos();
	s.hms();
	s.bugzilla();
	
}
	
	}
	


