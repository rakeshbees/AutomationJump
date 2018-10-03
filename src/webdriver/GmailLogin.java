package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://gmail.com");
driver.findElement(By.name("identifier")).sendKeys("secrupak@gmail.com");
//driver.findElement(By.id("RveJvd.snByac")).click();
driver.findElement(By.xpath("//div[@id='identifierNext']/content/span")).click();
driver.findElement(By.name("password")).sendKeys("1001201290");
//driver.findElement(By.id("passwordNext")).click();
driver.findElement(By.xpath("//div[2]/div/div/div[2]/div/content/span")).click();



	}
public void logout(){
	By driver = null;
	driver.findElement((SearchContext) By.xpath("//div[@id='gb']/div/div/div[2]/div[4]/div/a/span")).click();
	driver.findElement((SearchContext) By.linkText("Sign out")).click();		


	}

}
