package basic_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Type_Clear {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement web=driver.findElement(By.name("q"));
		web.sendKeys("RUPAK");
		Thread.sleep(5000);
		//web.clear();
		//driver.quit();
		
		web.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		web.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(5000);
		
		driver.close();

	}

}
