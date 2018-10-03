package com.components;

import com.objectRepository.HMSPR_Locators;
import com.utility.BaseClass;
import com.utility.ReadData;

public class HMSLoginPageMethods extends BaseClass{
	HMSPR_Locators prLocators=new HMSPR_Locators();
	
	public HMSLoginPageMethods(ReadData readData){
		this.readData=readData;
	}
	
	public void launchApp() throws Exception{
		try{
			openBrowser("chrome");
			openURL("http://selenium4testing.com/hms");	
			readData.addStepDetails("launchApp","Application should open the url","Successfully opened the URL" ,"Pass", "Y");
			}catch(Exception e){
				readData.addStepDetails("launchApp","Application should open the url","Unable to Open URL"+e.getMessage() ,"Fail", "N");		
			}

		
	}
	public void login() throws Exception{
		try{
			type(prLocators.username, readData.testDataValue.get("Username"));
			type(prLocators.password, readData.testDataValue.get("Password"));
			click(prLocators.login);
			readData.addStepDetails("login","Application should login","Successfully Logged in" ,"Pass", "Y");		
		}catch(Exception e){
			readData.addStepDetails("login","Application should login","Unable to login in"+e.getMessage() ,"Fail", "N");		
		}
		
	}

}
