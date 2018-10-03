package calenderHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class CalenderTest {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Actions a=new Actions(driver);
		 WebElement e=driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[2]/a"));
		 a.moveToElement(e).build().perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[2]/ul/li[4]/a")).click();
		
		driver.switchTo().frame("mainpanel");
		
		String date="19-September-2017";
		String dateArr[]=date.split("-");//{19,September,2017}
		String day=dateArr[0];
		String month=dateArr[1];
		String year=dateArr[2];
		
		Select select=new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1=new Select(driver.findElement(By.name("slctYear")));
		select.selectByVisibleText(year);
		
		

	}

}
