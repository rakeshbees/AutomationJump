package deletecookies;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.http.cookie.SetCookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.util.Cookie;

public class Cookies_Details {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://google.com");
	    Set<org.openqa.selenium.Cookie> cookies = driver.manage().getCookies();
	    
     System.out.println("size of cookies:"+cookies.size());
     for(org.openqa.selenium.Cookie cookie:cookies)
     {
    	 System.out.println("size of cookies:"+""+cookie.getValue());
     }
     driver.manage().deleteAllCookies();
     System.out.println("size of cookies:" + cookies.size());
     }

	}


