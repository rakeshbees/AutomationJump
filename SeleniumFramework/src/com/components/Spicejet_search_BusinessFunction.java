package com.components;

import org.openqa.selenium.WebDriver;
import com.objectRepository.Spicejet_Search_Locator;
import com.utility.BaseClass;
import com.utility.ReadData;

public class Spicejet_search_BusinessFunction extends BaseClass{

	WebDriver driver;
	public Spicejet_Search_Locator SpicejetLocator=new Spicejet_Search_Locator(driver);
	public ReadData pdfresultReport=new ReadData();
	
	public Spicejet_search_BusinessFunction(ReadData readData)
	{
		this.readData=readData;
	}
	
	public void launchApp() throws Exception{
		try{
			log.info("Execution Started......................");	
			openURL(readData.testDataValue.get("AppURL"));
			log.info("Opened the URL::::::::::::"+readData.testDataValue.get("AppURL"));
			readData.addStepDetails("Open the URL","Application should open the url","Successfully opened the URL" + " ","Pass", "Y");
		  }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  readData.addStepDetails("openURL method ","Application should open the url", "Unable to open the URL"+e.getMessage(),"Fail", "N");
		  }
	}
	public void find_flight() throws Exception{
		try{
			click(SpicejetLocator.OneWaySrch);
			log.info("clickied on one way search radio button");
			click(SpicejetLocator.LeavingFrom);
			log.info("clicked on leaving from");
			waitForElement(SpicejetLocator.Hyderabad, 20);
			click(SpicejetLocator.Hyderabad);
			log.info("clicked on hyderabad");
			waitForElement(SpicejetLocator.Manglore, 20);
			//Thread.sleep(5000);
			click(SpicejetLocator.Manglore);
			log.info("clicked on tirupati");
			click(SpicejetLocator.Date_19);
			log.info("clicked on date");
			select(SpicejetLocator.Adult, "4 Adults");
			log.info("selected 4 adults from drop down");
			select(SpicejetLocator.Child, "2 Children");
			log.info("selected 2 Children from drop down");
			select(SpicejetLocator.Infants, "1 Infant");
			log.info("selected 1 Infant from drop down");
			select(SpicejetLocator.Currency, "Indian Rupee(INR)");
			log.info("selected Indian Rupee(INR) from drop down");
			click(SpicejetLocator.FindFlightBtn);
			log.info("clicked on Find Flight Button");
		
		readData.addStepDetails("one wat search ","One way related flight should be displayed","got the list of flights" ,"Pass", "Y");
		  }catch(Exception e){
			  log.fatal("Unable to get the flights related to one wat search"+e.getMessage());
			  readData.addStepDetails("one wat search  ","One way related flight is not displaying", "one way search id not displaying :"+e.getMessage(), "Fail", "N");
		  }
	}
	

}
