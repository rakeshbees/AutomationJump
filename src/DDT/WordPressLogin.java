package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordPressLogin 
{
	WebDriver driver;
	
	@Test(dataProvider="HMSData")
	public void loginToWordpress(String username,String password) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://selenium4testing.com/hms");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(5000);
		//System.out.println(driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Master Page"),"User is not able to login-Invalid Credentials");
		System.out.println("Page Title is verified user is able to login successfully");
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@DataProvider(name="HMSData")
	public Object[][] passData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="admin1";
		data[0][1]="admin1";
		
		data[1][0]="admin";
		data[1][1]="admin";
		
		data[2][0]="admin123";
		data[2][1]="admin123";
		
		return data;
	}

}
