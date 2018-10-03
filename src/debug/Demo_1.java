package debug;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Demo_1 
{
	WebDriver driver=null;
	
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://learn-automation.com/");
		String title=driver.getTitle();
		boolean value=title.contains("Selenium");
		System.out.println("Status value is "+ value);
		
		
	}
	@Test
	
		public void test2()
		{
		 driver.quit();
		}
		
	

}
