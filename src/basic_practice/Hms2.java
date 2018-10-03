package basic_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hms2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium4testing.com/hms/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//img[@id='closediv']")).click();
		//driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.linkText("Registration")).click();
		
		
		new Select(driver.findElement(By.xpath("//select[@name='PATIENT_CAT']"))).selectByVisibleText("Self");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("SWARNALATA sAHU");
		driver.findElement(By.name("PNT_NAME")).sendKeys("RUPAK");
		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("KUMAR");
		driver.findElement(By.name("LAST_NAME")).sendKeys("SAHU");
		
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("Voter ID");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("10050006000");
		
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("Yes");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("B.Tech");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("B+");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
		
		driver.findElement(By.xpath("//input[@name='DOB']")).sendKeys("12-05-2017");
		driver.findElement(By.name("AGE")).sendKeys("26");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Hindi");
		
		driver.findElement(By.name("ADDRESS1")).sendKeys("BARIPADA");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("8686436736");
		driver.findElement(By.name("EMAIL_ID")).sendKeys("rupaksahu@gmail.com");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
		driver.findElement(By.name("ZIP")).sendKeys("757031");
		driver.findElement(By.name("image")).sendKeys("D:\\Library\\Picture 2985.jpg");
		
		driver.findElement(By.xpath("//*[@id='form1']/div[1]/table/tbody/tr[18]/td[3]/input")).clear();
		
		
		//driver.findElement(By.name("submit")).click();
		
		//driver.switchTo().alert().accept();
	
		//driver.switchTo().alert().dismiss();
		
		
		
		

	}

}
