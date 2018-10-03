package basic_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='post-body-7708391096228750161']/button")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		//WebElement element=driver.findElement(By.xpath("//*[@id='demo']"));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("*[@id='demo']")));
		
		boolean status=element.isDisplayed();
		
		if(status)
		{
			System.out.println("Elememt is Displayed");
			
		}
		else
		{
			System.out.println("Element is not Displayed");
		}
		

	}

}
