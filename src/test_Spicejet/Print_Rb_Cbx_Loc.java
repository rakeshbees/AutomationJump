package test_Spicejet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Print_Rb_Cbx_Loc {
	WebDriver driver;
  @Test
  public void f() {
	  List<WebElement> s=driver.findElements(By.tagName("input"));
	  System.out.println(s.size());
for (int i = 0; i < s.size(); i++) {
	if(s.get(i).getAttribute("type").equalsIgnoreCase("radio"))
	{
		System.out.println("RB id: "+s.get(i).getAttribute("id"));
	}
	else if(s.get(i).getAttribute("type").equalsIgnoreCase("checkbox"))
	{
	System.out.println("Chk id : "+s.get(i).getAttribute("id"));	  
	}
	}
  }
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://spicejet.com");	


  }
}
