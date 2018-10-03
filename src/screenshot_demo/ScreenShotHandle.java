package screenshot_demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShotHandle {
	
	 static WebDriver driver;

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		takesscreenshot("facebook_LoginPage");
		

	}
	public static void takesscreenshot(String filename) throws IOException{
		//1:Take screenshot and store it as a file format
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//2:Now copy the screenshot to desired loaction using copy file method
		
		FileUtils.copyFile(file,new File("D:\\workspace1\\SeleniumAutomation\\src\\"
				+ "screenshot_demo"+filename+".jpg"));
		
	}

}
