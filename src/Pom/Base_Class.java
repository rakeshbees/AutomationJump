package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public WebDriver driver;
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	public void openurl(String url){
		driver.get(url);
	}
	public void enterText(By loc,String data){
		driver.findElement(loc).sendKeys(data);
	}
	public void click(By loc){
		driver.findElement(loc).click();
	}
	public void select(By loc,String data){
		new Select(driver.findElement(loc)).selectByVisibleText(data);
	}
	public void alert_ok(){
		driver.switchTo().alert().accept();
	}
	public void alert_cancel(){
		driver.switchTo().alert().dismiss();
	}
	public void childwindow(String Windowname){
		driver.switchTo().window(Windowname);
	}
	public void wait(int time) throws Exception{
		Thread.sleep(2000);
	}

}
