package com.components;

import com.objectRepository.GmailLoginLocators;
import com.utility.BaseClass;
import com.utility.ReadData;

public class GmailLoginPageMethods extends BaseClass{
	
	public GmailLoginLocators loginLocators=new GmailLoginLocators();

	public GmailLoginPageMethods(ReadData readData)
	{
		this.readData=readData;
	}
	
	public void launchApp() throws Exception{
		try{
			openBrowser("chrome");
		openURL(readData.testDataValue.get("AppURL"));
		readData.addStepDetails("openURL","Application should open the url","Successfully opened the URL" + " ","Pass", "Y");
		  }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  readData.addStepDetails("openURL method ","Application should open the url", "Unable to open the URL"+e.getMessage(),"Fail", "N");
		  }
	}
	public void login() throws Exception{
		try{
		type(loginLocators.username, readData.testDataValue.get("Username"));
		click(loginLocators.next);
		Thread.sleep(2000);
		type(loginLocators.password, readData.testDataValue.get("Password"));
		click(loginLocators.signIn);
		waitForElement(loginLocators.signOutImage, 20);	
		  }catch(Exception e){
		  }
	}
	public void logout() throws Exception{
		try{
		click(loginLocators.signOutImage);
		Thread.sleep(1000);
		click(loginLocators.signOut);
		readData.addStepDetails("logout ","Gmail should logout from the application","Successfully Logout from the application" ,"Pass", "Y");
		  }catch(Exception e){
			  log.fatal("Unable to login into the application"+e.getMessage());
			  readData.addStepDetails("logout ","Gmail should logout from the application", "Unable to login into the application :"+e.getMessage(), "Fail", "N");
		  }
	}
	
}
