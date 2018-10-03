package mousehover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.xpath("//input[@name='log']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("demo123");
		driver.findElement(By.xpath("//input[@name='wp-submit']")).click();
		
		//To set the window size
	//	driver.manage().window().setSize(new Dimension(300, 500));
		
		//To get the window size
		//for height
	//	driver.manage().window().getSize().getHeight();
		//for width
	//	driver.manage().window().getSize().getWidth();
		
		//How to set position of window from left side and top side
	//	driver.manage().window().setPosition(new Point(50, 200));

		
		driver.manage().window().getPosition().getX();
		
		driver.manage().window().getPosition().getY();
	}

}
