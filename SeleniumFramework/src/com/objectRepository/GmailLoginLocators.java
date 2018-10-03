package com.objectRepository;

import org.openqa.selenium.By;

public class GmailLoginLocators {
	
	public By username=By.xpath("//input[@id='Email']");
	public By next=By.xpath("//input[@id='next']");	
	public By password=By.xpath("//input[@id='Passwd']");
	public By signIn=By.xpath("//input[@id='signIn']");
	
	public By signOutImage=By.xpath("//*[@id='gb']/div[2]/div[1]/div[2]/div[4]/div[1]/a/span");
	
	
	public By signOut=By.xpath("//*[@id='gb_71']");
	

}
