package actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Select {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).click();
		
		/*Actions act=new Actions(driver);
		act.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN,Keys.DOWN)).perform();
*/
	
	}

}
