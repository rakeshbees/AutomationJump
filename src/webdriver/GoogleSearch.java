package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("lst-ib")).sendKeys("selenium4testing");
		driver.findElement(By.id("_fZl")).click();
		driver.quit();
		
		

	}

}
