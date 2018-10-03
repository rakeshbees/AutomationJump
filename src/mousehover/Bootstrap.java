package mousehover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//*[@id='get_sign_up']")).click();
		driver.switchTo().frame("authiframe");
		driver.findElement(By.xpath("//*[@id='authMobile']")).sendKeys("8686436736");
		driver.findElement(By.xpath("//*[@id='mobileSubmitBtn']")).click();
		driver.findElement(By.xpath("//*[@id='otp_index1']")).click();
		
	}

}
