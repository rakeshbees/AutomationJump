package junit;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4Links_Junit {
	WebDriver driver;
		
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://selenium4testing.com/");
		driver.findElement(By.id("closediv")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test1() throws Exception {
		driver.findElement(By.linkText("New Batches")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Manual FAQs")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Selenium FAQs")).click();
		Thread.sleep(2000);
	}
	@Test
	public void test2()throws Exception{
		driver.findElement(By.linkText("Core Java FAQs")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("General Testing FAQs")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Downloads")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("HMS")).click();
		Thread.sleep(2000);
		
		
	
		
		

	
		
	}

}
