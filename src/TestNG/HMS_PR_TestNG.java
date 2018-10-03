package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HMS_PR_TestNG {
	WebDriver  driver;
  @Test //TestScenario
  public void averifyLogin() throws Exception {
	  driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();	
		Thread.sleep(2000);
  }
  @Test
  public void bnavigateToPR(){
	  driver.findElement(By.linkText("Registration")).click();
	  driver.findElement(By.linkText("Permanent Registration")).click();
  }
  @Test
  public void createPatient() throws Exception{
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		driver.findElement(By.name("PNT_NAME")).sendKeys("mahesh");
		driver.findElement(By.name("LAST_NAME")).sendKeys("guvvadi");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("DOB")).click();
		driver.findElement(By.xpath(".//*[@id='form1']/div[1]/table/tbody/tr[6]/td[2]/input")).sendKeys("12-07-2017");
		driver.findElement(By.name("AGE")).sendKeys("20");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("PAN Card");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("PAN Card");
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("B.Tech");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("O+");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("Yes");
		driver.findElement(By.name("ADDRESS1")).sendKeys("kukatpally pragathi nagar");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("9876543210");
		
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
		driver.findElement(By.name("ZIP")).sendKeys("500091");
		driver.findElement(By.name("image")).sendKeys("D:\\Library\\Picture 2985.jpg");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);		
	
  }
  
  @BeforeTest //Pre condition
  public void beforeTest() {
		 System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();	
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://selenium4testing.com/hms/");	
  }

  @AfterTest //Post condition
  public void afterTest() {
	  driver.quit();
  }

}
