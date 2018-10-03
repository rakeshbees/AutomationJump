package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://facebook.com");
driver.findElement(By.id("email")).sendKeys("Mailid");
driver.findElement(By.id("pass")).sendKeys("Password");
driver.findElement(By.id("loginbutton")).click();

	}

}
