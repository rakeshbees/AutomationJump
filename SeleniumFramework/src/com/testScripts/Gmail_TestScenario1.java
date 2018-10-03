package com.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.components.GmailLoginPageMethods;
import com.utility.BaseClass;

public class Gmail_TestScenario1 extends BaseClass{
	public GmailLoginPageMethods loginMethods=new GmailLoginPageMethods(readData);
	
/*	public void initializeRepository() throws Exception {		
		reportDetails.put("Test Script Name", this.getClass().getSimpleName());
		reportDetails.put("Test Script MyWorksshop Document ID", "Doc1234567");
		reportDetails.put("Test Script Revision No", "1");
		reportDetails.put("Test Author Name", "Nagesh");
		reportDetails.put("Test Script Type", "User Acceptance Testing");
		reportDetails.put("Requirement Document ID of System", "Doc1234567");
		reportDetails.put("Requirement ID", "US2202");
	}*/
	
	@Parameters("TestcaseNo")
	@Test(description = "Scenario:1 - Test the functionality of Consumer with valid flow")
  public void f(String no) throws Exception {
	  System.out.println("Entered in the test method..................");
	  readData.readTestDataFile("\\Resources\\TestData.xlsx", no);
	//  initializeRepository();
	  loginMethods.launchApp();
	  loginMethods.login();
	  loginMethods.logout();
	  
  }
}
