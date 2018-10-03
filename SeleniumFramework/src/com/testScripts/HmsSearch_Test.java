package com.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.components.HmsSearch_BusinessFunction;
import com.components.Spicejet_search_BusinessFunction;
import com.utility.BaseClass;

public class HmsSearch_Test extends BaseClass {

	public HmsSearch_BusinessFunction HMSRegistration=new HmsSearch_BusinessFunction();
	
	
	@Parameters("TestcaseNo")
	@Test(description = "Scenario:6 -  Test the permanent registration form in hms")
  public void f(String no) throws Exception {
	  System.out.println("Entered in the test method..................");
	  readData.readTestDataFile("D:\\MobileWorkSpace_730AM\\SeleniumFramework\\Testdata\\HMSTestData.xlsx", no);
	  HMSRegistration.launchApp();
	  HMSRegistration.login();
	  HMSRegistration.navigateToPR();
	  HMSRegistration.Permanent_Registration();
	 
  }
}
