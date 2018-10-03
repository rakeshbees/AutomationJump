package Pom;

import org.openqa.selenium.By;

import webdriverBasics.OpenURL;

public class HMS_LoginPage_Components extends Base_Class {
	
	
	
	HMS_LoginPage_Locators loginpage=new HMS_LoginPage_Locators();
		
		
		public void launchapp(){
			openBrowser();
			openurl("http://selenium4testing.com/hms");
		}
		public void login(){
			enterText(loginpage.username,"admin");
			enterText(loginpage.password,"admin");
			click(loginpage.login);
			
		}
		public void navigate_To_PR(){
			click(loginpage.registration);
			click(loginpage.PermanentRegistration);
		}
		public void cratepatient(){
			select(loginpage.Patientcategory,"Self");
			select(loginpage.Relation,"Brother");
			select(loginpage.Title,"Mr.");
			enterText(loginpage.MotherName,"Swarnalata");
			enterText(loginpage.FirstName,"Rupak");
			select(loginpage.Identity,"PAN Card");
			click(By.xpath("//input[@value='clear']"));
		}
	}


			
		
	


		
			
		
		
			
		
			
		
		
		
		
			
			
 
	 
	
