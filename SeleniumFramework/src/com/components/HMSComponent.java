package com.components;

import com.objectRepository.Hms_Locators;
import com.utility.BaseClass;

public class HMSComponent extends BaseClass{
	public Hms_Locators loc=new Hms_Locators();
	public void launchApp() throws Exception{
		try{
			openBrowser("chrome");
			openURL(readData.testDataValue.get("AppURL"));
			readData.addStepDetails("launchApp", "Open URL", "Successfully opened URL", "Pass", "Y");
			
		}catch(Exception e){
			readData.addStepDetails("launchApp", "Open URL", "Unable open URL", "Fail", "N");
		}
	}
	public void login() throws Exception{
		try{
			type(loc.Username, readData.testDataValue.get("Username"));
			type(loc.password, readData.testDataValue.get("Password"));
			click(loc.Login);
			readData.addStepDetails("login", "Login into the HMS", "Successfully loggedIn", "Pass", "Y");
			
		}catch(Exception e){
			readData.addStepDetails("login", "Login into the HMS", "Unable Login", "Fail", "N");
		}
	}

}
