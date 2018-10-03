package all_Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Impli_Expli_Demo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		WebElement firstname=driver.findElement(By.name("firstname"));
		WebElement lastname=driver.findElement(By.name("lastname"));
		
		WebElement mobileNum=driver.findElement(By.name("reg_email__"));
		
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		
		
		sendKeys(driver, firstname, 10, "Tom");
		sendKeys(driver, lastname, 5, "Peter");
		sendKeys(driver, mobileNum, 5, "8686436736");
		sendKeys(driver, password, 10, "test@123");
		
		
		WebElement forgotAccount=driver.findElement(By.linkText("Forgotten account?"));
		clickOn(driver, forgotAccount, 5);
		
		
		
	}
	
	public static void sendKeys(WebDriver driver,WebElement element,int timeout,String value){
		new WebDriverWait(driver,timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void clickOn(WebDriver driver,WebElement element,int timeout){
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	

	}

}
