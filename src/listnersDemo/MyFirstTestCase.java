package listnersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class MyFirstTestCase 
{
	@Test
	public void GoogleTitleVerify()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	@Test
	public void TitleMatch()
	{
		System.out.println("Test 2 Dummy");
	    Assert.assertTrue(false);
	    

	}

}
