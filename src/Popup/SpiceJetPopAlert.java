package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJetPopAlert {
	private WebDriver driver;
	public void launchBrowser()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	}
	
	public void OpenUrl()
	{
		driver.get("http://www.spicejet.com/");
	}
	public void bookFlight() throws Exception
	{
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Delhi (DEL)")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		driver.findElement(By.linkText("28")).click();
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("3 Adults");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("2 Children");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("1 Infant");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		//Thread.sleep(5000);

	}
	
	public void popup() throws Exception
	{
		String mainWindow=driver.getWindowHandle();
		driver.findElement(By.linkText("Currency Converter")).click();
		driver.switchTo().window("converter");
		new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"))).selectByVisibleText("UAE Dirham(AED)");
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window(mainWindow);
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("AvailabilitySearchInputSelectViewdestinationStation1"))).selectByVisibleText("Vijayawada (VGA)");
	}


	public static void main(String[] args)  throws Exception
	{
		SpiceJetPopAlert p= new SpiceJetPopAlert();
		p.launchBrowser();
		p.OpenUrl();
		p.bookFlight();
		p.popup();

	 }

}
