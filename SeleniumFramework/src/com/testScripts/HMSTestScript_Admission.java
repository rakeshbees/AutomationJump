package com.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.components.HMSAdmission;
import com.utility.BaseClass;

public class HMSTestScript_Admission extends BaseClass{
	HMSAdmission admission=new HMSAdmission();
  @Parameters("TestcaseNo")
  @Test(description = "Scenario:6 -  Test the permanent registration form in hms")
  public void f(String no) throws Exception {
	  System.out.println("Entered in the test method..................");
readData.readTestDataFile(".\\Testdata\\HMSTestData.xlsx", no);
	 
	  admission.launchApp();
	  admission.login();
  }
}
