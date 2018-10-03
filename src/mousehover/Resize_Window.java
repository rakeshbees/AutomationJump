package mousehover;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resize_Window {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(200,800);
		driver.manage().window().setSize(d);
		driver.get("https://www.google.co.in");
		
	}

}
