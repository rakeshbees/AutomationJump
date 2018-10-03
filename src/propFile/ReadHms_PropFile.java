package propFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadHms_PropFile {
	 static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		
		FileInputStream ip=new FileInputStream("D:\\workspace1\\SeleniumAutomation\\src\\propFile\\hms.properties");
		prop.load(ip);
		
		String url=prop.getProperty("URL");
		System.out.println(url);
		
		String browsername=prop.getProperty("browser");
		System.out.println(browsername);
		
		if(browsername.equals("chrome")){
		
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		
		}else if(browsername.equals("FF")){
			System.setProperty("webdriver.firefox.driver","D:\\Library\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("login_xpath"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("registartion_xpath"))).click();
		
		new Select(driver.findElement(By.xpath(prop.getProperty("patientcategory_xpath")))).selectByVisibleText(prop.getProperty("patientcategory"));
		new Select(driver.findElement(By.xpath(prop.getProperty("relation_xpath")))).selectByVisibleText(prop.getProperty("relation"));
		driver.findElement(By.xpath(prop.getProperty("DOB_xapth"))).sendKeys(prop.getProperty("DOB"));
	}

}
