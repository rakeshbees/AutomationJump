package com.components;

import com.objectRepository.Hms_Locators;
import com.utility.BaseClass;

public class HMSAdmission extends BaseClass{
	Hms_Locators loc=new Hms_Locators();
	
	
	public void launchApp(){
		try{
			openBrowser("chrome");
			log.info("Opened chrome browser");
			openURL(readData.testDataValue.get("AppURL"));
			log.info("opened URL :"+readData.testDataValue.get("AppURL"));
		}catch(Exception e){
			log.fatal("Unable to execute launchApp method :"+e.getMessage());
		}
	}
	public void login(){
		try{
			type(loc.Username, readData.testDataValue.get("Username"));
			type(loc.password, readData.testDataValue.get("Password"));
			click(loc.Login);
		}catch(Exception e){
			
		}
		
	}

}
