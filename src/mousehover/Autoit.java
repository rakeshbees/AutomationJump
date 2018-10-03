package mousehover;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autoit {

	@Test
	public void testautoit() throws Exception{
		
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Rupak/Desktop/fileupload.html");
		driver.findElement(By.xpath("/html/body/input")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Rupak\\Desktop\\Autoit\\Fileupload.exe");
	}
}
	

		

	


