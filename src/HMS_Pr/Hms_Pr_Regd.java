package HMS_Pr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hms_Pr_Regd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://selenium4testing.com/hms/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Permanent Registration")).click();
		
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("Swarnalata");
		driver.findElement(By.name("PNT_NAME")).sendKeys("xyzzzzz");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("PAN Card");
		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("Kumar");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("1001201290");
		driver.findElement(By.name("LAST_NAME")).sendKeys("sahu");
		driver.findElement(By.name("DOB")).sendKeys("06-09-2017");
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		
		
	

	}

}
