package com.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Spicejet_Search_Locator {
	WebDriver driver;
	public Spicejet_Search_Locator(WebDriver driver){
		this.driver=driver;
	}
	public By OneWaySrch=By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']");
	public By LeavingFrom=By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']");
	public By Hyderabad=By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[7]/a");

	public By Manglore=By.xpath("(//*[@id='dropdownGroup1']/div/ul[3]/li[5]/a)[2]");
	public By Date_calander = By.xpath("//*[@id='ctl00_mainContent_txt_Fromdate']");
	public By Date_19 = By.xpath("(//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[4]/a)[2]");

	public By Adult=By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']");
	public By Child=By.xpath("//*[@id='ctl00_mainContent_ddl_Child']");
	public By Infants=By.xpath("//*[@id='ctl00_mainContent_ddl_Infant']");
	public By Currency=By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']");
	public By FindFlightBtn=By.xpath("//*[@id='ctl00_mainContent_btn_FindFlights']");

	
}
