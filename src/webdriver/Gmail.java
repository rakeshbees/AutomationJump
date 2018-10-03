package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.gicko.driver","D:\\workspace1\\geckodriver\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://gmail.com");
driver.findElement(By.id("Email")).sendKeys("mailid");
driver.findElement(By.id("password")).sendKeys("password");
driver.findElement(By.id("signIn")).click();
	}

}
