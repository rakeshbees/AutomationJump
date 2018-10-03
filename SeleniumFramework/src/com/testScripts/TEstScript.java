package com.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.components.HMSComponent;
import com.utility.BaseClass;

public class TEstScript extends BaseClass{
	HMSComponent hms=new HMSComponent();
	@Parameters("TestcaseNo")
	@Test(description = "Scenario:6 -  Test the permanent registration form in hms")
  public void f(String no) throws Exception {
	  System.out.println("Entered in the test method..................");
	  readData.readTestDataFile("D:\\MobileWorkSpace_730AM\\SeleniumFramework\\Testdata\\HMSTestData.xlsx", no);
	  hms.launchApp();
	  hms.login();
  }
}
