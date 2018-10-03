package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AD_Advice {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://selenium4testing.com/hms/");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.linkText("ADT")).click();
		driver.findElement(By.linkText("Admission Advice")).click();
		
		
		
		driver.findElement(By.name("MR_NO")).sendKeys("PR5607014843");
		driver.findElement(By.name("PNT_NAME")).sendKeys("Rahul Sahu");
		new Select(driver.findElement(By.name("GENDER"))).selectByVisibleText("Male");
		new Select(driver.findElement(By.name("DOC_NAME"))).selectByVisibleText("Sai");
		new Select(driver.findElement(By.name("DOC_SPL"))).selectByVisibleText("Cordialagist");
		new Select(driver.findElement(By.name("ADMISSION_TYPE"))).selectByVisibleText("Emergency");
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
		new Select(driver.findElement(By.name("HOSPITAL_SERVICES"))).selectByVisibleText("X-Ray");
		driver.findElement(By.name("PROVI_DIOGNOS")).sendKeys("Yes");
		driver.findElement(By.name("EXP_DATE")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div[2]/form/table/tbody/tr[9]/td[2]/input")).sendKeys("14-07-2017");
		driver.findElement(By.name("EXP_LENGTH")).sendKeys("5");
		new Select(driver.findElement(By.name("BED_REQ"))).selectByVisibleText("Yes");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		
		
		driver.switchTo().alert().accept();

	}

}
