package com.interviewquestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.thoughtworks.selenium.webdriven.commands.DoubleClick;

public class Doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		//double click
		WebElement s= driver.findElement(By.xpath("//*[@id='lga']/div"));
		Actions a=new Actions(driver);
		a.doubleClick(s).build().perform();
		//how to click link double click
		  WebElement webelement= driver.findElement(By.xpath("//*[@id='lga']/div"));
		  Actions action=new Actions(driver);
		  action.moveToElement(driver.findElement(By.xpath("//*[@name='btnI']"))).doubleClick().perform();
		  

	}

}
