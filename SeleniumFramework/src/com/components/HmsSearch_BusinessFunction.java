package com.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.objectRepository.Hms_Locators;
import com.objectRepository.Spicejet_Search_Locator;
import com.utility.BaseClass;
import com.utility.ReadData;

public class HmsSearch_BusinessFunction extends BaseClass {
	public Hms_Locators HmsLocators=new Hms_Locators();
	
	public void launchApp() throws Exception{
		try{
			log.info("Execution Started......................");
			openBrowser("chrome");
			log.info("Opened the browser......................");	
			openURL(readData.testDataValue.get("AppURL"));
		log.info("Opened the URL::::::::::::"+readData.testDataValue.get("AppURL"));
		readData.addStepDetails("launchApp","Application should open the url","Successfully opened the URL" ,"Pass", "Y");
		  }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  readData.addStepDetails("launchApp","Application should open the url", "Unable to open the URL"+e.getMessage(),"Fail", "N");
		  }
	}
	public void login() throws Exception{
		try{			
			type(HmsLocators.Username,readData.testDataValue.get("Username") );
			log.info("Entered username");
			type(HmsLocators.password, readData.testDataValue.get("Password"));
			log.info("Entered Password");
			click(HmsLocators.Login);
			log.info("Clicked on Login");	
		readData.addStepDetails("login ","HMS should login into the application","Logged in into the applciation" ,"Pass", "Y");
		  }catch(Exception e){
			  log.fatal("Unable to login into the application"+e.getMessage());
			  readData.addStepDetails("login ","HMS should login into the application", "Unable to login into the application :"+e.getMessage(), "Fail", "N");
		  }
	}
	public void navigateToPR() throws Exception{
		try{
			click(HmsLocators.Registration);
			log.info("clickied on Registration ");
			select(HmsLocators.Patient_catatgort, readData.testDataValue.get("Patient Category"));
			log.info("selected Insurance");
			readData.addStepDetails("navigateToPR ","HMS should login into the application", "Unable to login into the application :", "Pass", "Y");	
		 }catch(Exception e){
			  log.fatal("Unable to login into the application"+e.getMessage());
			  readData.addStepDetails("navigateToPR ","HMS should login into the application", "Unable to login into the application :"+e.getMessage(), "Fail", "N");
		  }	
	}
	
	public void Permanent_Registration() throws Exception{
		try{
			select(HmsLocators.Relation, readData.testDataValue.get("Relation"));
			log.info("selected Brother");
			
			select(HmsLocators.Title, readData.testDataValue.get("Title"));
			log.info("selected Mr.");
			
			type(HmsLocators.First_Name, readData.testDataValue.get("First Name"));
			log.info("typed first name as ram");
			
			select(HmsLocators.Patient_Identifier, readData.testDataValue.get("Patient Identifier"));
			log.info("selected PAN Card");
			
			type(HmsLocators.Pan_no, readData.testDataValue.get("PAN/Voter ID/AADAR Nos"));
			log.info("typed first pan no  as Bjp12345b");
			
			type(HmsLocators.Last_name, readData.testDataValue.get("Last Name"));
			log.info("typed last name  as sharma");
			
			click(HmsLocators.DOB);
			log.info("clickied on DOB ");
			
			waitForElement(HmsLocators.Date, 20);
			
			click(HmsLocators.Date);
			log.info("clickied on Date ");
			
			select(HmsLocators.Nationality, readData.testDataValue.get("Nationality"));
			log.info("selected Indian");
			
			type(HmsLocators.Age, readData.testDataValue.get("Age"));
			log.info("typed Age  as 23");
			
			select(HmsLocators.Vip, readData.testDataValue.get("VIP"));
			log.info("selected No");
			
			select(HmsLocators.Gender, readData.testDataValue.get("Gender"));
			log.info("selected Male");
			
			select(HmsLocators.Education, readData.testDataValue.get("Education"));
			log.info("selected B.Tech");
			
			select(HmsLocators.Marital_Status, readData.testDataValue.get("Marital Status"));
			log.info("selected Single");
			
			select(HmsLocators.Occupation, readData.testDataValue.get("Occupation"));
			log.info("selected Employee");
			
			select(HmsLocators.Religion, readData.testDataValue.get("Religion"));
			log.info("selected Hindu");
			
			select(HmsLocators.Bloodgrp, readData.testDataValue.get("Blood Group"));
			log.info("selected A+");
			
			select(HmsLocators.PrimaryLanguage, readData.testDataValue.get("Primary Language"));
			log.info("selected Hindi");
			
			select(HmsLocators.Citizenship, readData.testDataValue.get("Citizenship"));
			log.info("selected Indian");
			
			select(HmsLocators.SeniorCitizenProof, readData.testDataValue.get("Senior Citizen Proof Submited"));
			log.info("selected No");
			
			type(HmsLocators.Address1, readData.testDataValue.get("Address1"));
			log.info("typed Address as hyderabad");
			
			type(HmsLocators.Phone, readData.testDataValue.get("Phone"));
			log.info("typed phone  as 9988774455");
			
			select(HmsLocators.Country_code, readData.testDataValue.get("Country"));
			log.info("selected India");
			
			type(HmsLocators.Pin_Zip, readData.testDataValue.get("Pin or Zip"));
			log.info("typed pin no as 493196");
			
			type(HmsLocators.browse, readData.testDataValue.get("Path"));
			log.info("typed pin no as 493196");
			Thread.sleep(2000);
			click(HmsLocators.Submit);
			log.info("clickied on submit ");
			Thread.sleep(2000);
			alertaction("ok");
			Thread.sleep(2000);
			readData.addStepDetails("Permanent Registration  ","Permanent Registration  should be done","Conformation shoud get" ,"Pass", "Y");
		  }catch(Exception e){
			  log.fatal("Unable to get the conformation of permanent registration"+e.getMessage());
			  readData.addStepDetails("Permanent Registration ","Permanent Registration is not done", "Invalid credential :"+e.getMessage(), "Fail", "N");
		  }
    }
}
