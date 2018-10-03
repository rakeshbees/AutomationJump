package mousehover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize_Object {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions action=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		action.clickAndHold(drag).moveByOffset(200,50).release(drag).build().perform();
		Thread.sleep(4000);
		

	}

}
