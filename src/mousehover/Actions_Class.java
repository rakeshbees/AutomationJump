package mousehover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
		
		Actions a=new Actions(driver);
		driver.switchTo().frame(0);
	    WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		/*a.doubleClick(drag);
		a.contextClick(drag);
		Thread.sleep(4000);
        a.dragAndDrop(drag,drop).perform();
        Thread.sleep(4000);
		*/
		
		
		a.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
		Thread.sleep(4000);

	}

}
