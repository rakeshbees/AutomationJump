package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Inheritance_Downloads extends CaptureScreenShort {
  @Test
  public void verifyDownloads() throws Exception {
	  driver.findElement(By.linkText("Downloads")).click();
	  takeScreenShort("Downloads");
	  
  }
}
