package smoketest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.sun.mail.imap.Utility;

public class VerifyTitle 

{
	ExtentReports report;
	ExtentTest logger;
	WebDriver diver;
	
	@Test
	public void verifyBlogTitle()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://learn-automation.com");
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Selenium"));
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			//Utility.c
		}
		 
	}

}
