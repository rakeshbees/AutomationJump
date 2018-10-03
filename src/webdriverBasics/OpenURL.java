package webdriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {
public static class OpenURL_Selenium4Testing{
		
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://selenium4testing.com");
	}		
}
}
	


