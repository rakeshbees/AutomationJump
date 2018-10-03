package mousehover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		
		//doubel click
		WebElement s=driver.findElement(By.xpath("//*[@id='lga']/div"));
		Actions action=new Actions(driver);
		action.doubleClick(s).build().perform();
		//how to click link double click
		WebElement webelement=driver.findElement(By.xpath("//*[@id='lga']/div"));
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Spice Add - Ons"))).doubleClick().build().perform();
		

	}

}
