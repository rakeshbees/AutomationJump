package iframedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesDemo 
{
	
	@Test
	public void testFrame()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/html/myframes.html");
		
		driver.switchTo().frame("selenium_news");
		
		driver.findElement(By.xpath("//input[@id='q']")).click();
		

		
	}

}
