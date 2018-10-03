package HMS_Webtable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Print_All_Links {
	WebDriver driver;
  @Test
  public void links_name() {
	  List<String> s=new ArrayList<String>();
	  List<String> s1=new LinkedList<String>();
	  List<WebElement> s2=new ArrayList<WebElement>();
	  
	List<WebElement> str= driver.findElements(By.tagName("a"));
	System.out.println(str.size());
	for (int i = 0; i < str.size(); i++) {
		
			
		if (str.get(i).getText().equalsIgnoreCase("")) {
			System.out.println(str.get(i).getText());
			
		}
		
	}
	
		
	
  }
  @BeforeTest
  public void beforeTest() {

	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://selenium4testing.com");
		driver.findElement(By.id("closediv")).click();
  }

  @AfterTest
  public void afterTest() {
  }

}
