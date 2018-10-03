package actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class All_Actions 
{
	WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com/");
		
		Actions a=new Actions(driver);
	WebElement e=driver.findElement(By.xpath("//a[contains(text(),'Add-Ons')]"));
	a.moveToElement(e).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Hot Meals ')]")).click();
	//WebDriverWait =FluentWait<"10">;
	//driver.getClass();
	String str;
	 str=driver.getCurrentUrl();
	
		
	
		
		
	}

}
