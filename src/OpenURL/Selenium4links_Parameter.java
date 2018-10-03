package OpenURL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4links_Parameter {
	private WebDriver driver;
	
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void openURL(String url){
		driver.get("http://selenium4testing.com/");
		driver.findElement(By.id("closediv")).click();
	}
	
	public void clickLink(String str){
		driver.findElement(By.linkText(str)).click();	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selenium4links_Parameter s=new Selenium4links_Parameter();
		s.openBrowser();
		s.openURL("http://selenium4testing.com/");
		s.clickLink("Manual FAQs");
		s.clickLink("Selenium FAQs");
		s.clickLink("Core Java FAQs");
		s.clickLink("Downloads");
		s.clickLink("Resumes");
		s.clickLink("Videos");
		s.clickLink("HMS");
		s.clickLink("Bugzilla");
		

	}

}






