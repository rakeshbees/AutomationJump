package basic_practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
static	WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		
		FileInputStream ip=new FileInputStream("D:\\workspace1\\SeleniumAutomation\\src\\basic_practice\\config.properties");
		
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String url=prop.getProperty("URL");
		System.out.println(url);
		
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")){
			
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		
		}else if(browserName.equals("FF")){
			
			System.setProperty("webdriver.firefox.driver","D:\\Library\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		driver.get(url);
		/*
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("Firstname"));
		
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("Lastname"));
		
		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(prop.getProperty("Email"));*/
		
		
		driver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys(prop.getProperty("username"));
		
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
		
		

	}

}
