package customreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;



public class VerifySeleniumTitle {
	
	@Test
	public void verifyTitle(){
		
		//ExtentReports logger=  ExtentReports.get(VerifySeleniumTitle.class);
		
	//	logger.init("",true)
		
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://learn-automation.com");
		
	String title=driver.getTitle();
	Assert.assertTrue(title.contains("Selenium"));
	
		
	}
	

}
