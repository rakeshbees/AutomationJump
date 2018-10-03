package com.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.components.HMSLoginPageMethods;
import com.utility.BaseClass;

public class HMSPRScenario1 extends BaseClass{
	public HMSLoginPageMethods loginpage=new HMSLoginPageMethods(readData);
	
  @Parameters("TestcaseNo")	
  @Test(description = "Scenario:6 -  Test the permanent registration form in hms")
  public void f(String no) throws Exception {
	  readData.readTestDataFile(System.getProperty("user.dir")	+ "\\Resources\\TestData.xlsx", no);
	  loginpage.launchApp();
	  loginpage.login();
  }
}
