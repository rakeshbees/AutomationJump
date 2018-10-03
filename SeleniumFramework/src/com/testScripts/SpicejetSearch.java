package com.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.components.Spicejet_search_BusinessFunction;
import com.utility.BaseClass;

public class SpicejetSearch extends BaseClass{

	public Spicejet_search_BusinessFunction Spicejet=new Spicejet_search_BusinessFunction(readData);
	public void initializeRepository() throws Exception {		
		reportDetails.put("Test Script Name", this.getClass().getSimpleName());
		reportDetails.put("Test Script MyWorksshop Document ID", "Doc1234567");
		reportDetails.put("Test Script Revision No", "1");
		reportDetails.put("Test Author Name", "Nagesh");
		reportDetails.put("Test Script Type", "User Acceptance Testing");
		reportDetails.put("Requirement Document ID of System", "Doc1234567");
		reportDetails.put("Requirement ID", "US2202");
	}
	
	@Parameters("TestcaseNo")
	@Test(description = "Scenario:5 - Test the one way search in spicejet.com")
  public void f(String no) throws Exception {
	  System.out.println("Entered in the test method..................");
	  readData.readTestDataFile(System.getProperty("user.dir")	+ "\\Resources\\TestData.xlsx", no);
	  initializeRepository();
	  Spicejet.launchApp();
	  Spicejet.find_flight();
	 
  }
}
