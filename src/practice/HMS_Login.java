package practice;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class HMS_Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	driver.get("http://selenium4testing.com/hms/");
	
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin");
	driver.findElement(By.name("submit")).click();
	driver.findElement(By.linkText("Registration")).click();
	
	
	new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
	new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
	new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
	driver.findElement(By.name("MOTHER_NAME")).sendKeys("Rupak");
	driver.findElement(By.name("PNT_NAME")).sendKeys("Deepak");
	new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("Voter ID");
	driver.findElement(By.name("MIDDLE_NAME")).sendKeys("kumar");
	driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("10001200");
	driver.findElement(By.name("LAST_NAME")).sendKeys("sahu");
	driver.findElement(By.name("DOB"));
	driver.findElement(By.xpath(".//*[@id='form1']/div[1]/table/tbody/tr[6]/td[2]/input")).sendKeys("12-07-2017");
    new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
    driver.findElement(By.name("AGE")).sendKeys("25");
    new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
    new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
    new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("B.Tech");
    new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
    new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
    new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
    new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("B+");
    new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("English");
    new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
    new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
    
    
    driver.findElement(By.name("ADDRESS1")).sendKeys("BLR");
    driver.findElement(By.name("MOBILE_NO")).sendKeys("8686436736");
    driver.findElement(By.name("EMAIL_ID")).sendKeys("rupak@gmail.com");
    new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
    driver.findElement(By.name("ZIP")).sendKeys("757031");
    driver.findElement(By.name("image")).sendKeys("C:\\Users\\Rupak\\Desktop\\rupak..pasport.jpg");
    driver.findElement(By.name("submit")).click();
    
    
    driver.switchTo().alert().accept();

	}

}
