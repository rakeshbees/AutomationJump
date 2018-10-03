package mousehover;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Take_ScreenShort {
	
	@Test
	public void capturescreenshort() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rupaksahu");
		
		      TakesScreenshot ts=(TakesScreenshot)driver;
		      File source=ts.getScreenshotAs(OutputType.FILE);
		      FileUtils.copyFile(source,new File("./Screenshort/facebook.png"));
		      System.out.println("screenshor taken");
		      
		      driver.quit();
		      
		
		
		
	}

}
