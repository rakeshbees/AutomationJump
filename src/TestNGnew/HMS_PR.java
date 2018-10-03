package TestNGnew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HMS_PR {
	WebDriver driver;
  @Test//Test Scenario
  public void averifyLogin() throws Exception {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(20000);
	  
  }
  @Test
  public void bnavigateTo_PR(){
	  driver.findElement(By.linkText("Registration")).click();
	  driver.findElement(By.linkText("Permanent Registration")).click();
	  
  }
  @Test
  public void createPatient() throws Exception{

		
		
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Insurance");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Father");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("Sabita");
		driver.findElement(By.name("PNT_NAME")).sendKeys("Rahul");
		
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("PAN Card");
		
		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("Kumar");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("FTU550345");
		driver.findElement(By.name("LAST_NAME")).sendKeys("Sahu");
		

		
		driver.findElement(By.name("DOB")).click();
		//driver.findElement(By.className("tcalToday.tcalSelected")).click();
		driver.findElement(By.xpath("//table[@id='tcalGrid']/tbody/tr[3]/td[4]")).click();
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		driver.findElement(By.name("AGE")).sendKeys("25");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("B.Tech");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("B+");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Hindi");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
		
		
		driver.findElement(By.name("ADDRESS1")).sendKeys("Baripada");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("9776810504");
		driver.findElement(By.name("EMAIL_ID")).sendKeys("secrupak@gmail.com");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
		driver.findElement(By.name("ADDRESS2")).sendKeys("Baripada");
		driver.findElement(By.name("ZIP")).sendKeys("757031");
		driver.findElement(By.name("image")).sendKeys("C:\\Users\\Rupak\\Downloads\\617471.jpg");
		
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(20000);
		
		
  }
  @BeforeTest 
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("http://selenium4testing.com/hms/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
