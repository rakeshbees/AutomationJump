package Gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login_Logout {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("secrupak@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(7000);
		driver.findElement(By.name("password")).sendKeys("1001201290");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(7000);
		driver.findElement(By.cssSelector("span.gb_7a.gbii")).click();
		driver.findElement(By.linkText("Sign out")).click();
		

	}

}
