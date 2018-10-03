package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HMSLogin {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://selenium4testing.com/hms/");
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("submit")).click();		
	}

}

