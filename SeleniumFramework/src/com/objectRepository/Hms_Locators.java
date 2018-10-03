package com.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hms_Locators {


	public By Username = By.xpath("//input[@name='username']");
	public By password = By.xpath("//input[@name='password']");
	public By Login = By.xpath("//input[@value='Login']");
  
	public By Registration =By.xpath("//*[@id='navigation']/li[1]/a");
	public By Patient_catatgort = By.xpath("//select[@name='PATIENT_CAT']");
	public By Relation = By.xpath("//select[@name='RELATION']");

	public By Title = By.xpath("//select[@name='TITLE']");
	public By First_Name = By.xpath("//input[@name='PNT_NAME']");
	public By Patient_Identifier = By.xpath("//select[@name='PAT_IDENTITY']");
	public By Pan_no =By.xpath("//input[@name='PAT_IDENTITY_PROOF']");
	public By Last_name = By.xpath("//input[@name='LAST_NAME']");
	public By DOB = By.xpath("//*[@name='DOB']");
	public By Date = By.xpath("//*[@id='tcalGrid']/tbody/tr[5]/td[3]");
	public By Nationality =By.xpath("//select[@name='NATIONALITY']");
	public By Age=By.xpath("//input[@name='AGE']");

	public By Vip = By.xpath("//select[@name='IS_MLC']");
	public By Gender =By.xpath("//select[@name='SEX']");
	public By Education =By.xpath("//select[@name='EDUCATION']");
	public By Marital_Status = By.xpath("//select[@name='MTRL_STATUS']");
	public By Occupation = By.xpath("//select[@name='OCCUPATION']");
	
	public By Religion = By.xpath("//select[@name='RELIGION']");
	public By Bloodgrp = By.xpath("//select[@name='BLOOD_GRP_CODE']");
	public By PrimaryLanguage = By.xpath("//select[@name='PLANGUAGE']");
	public By Citizenship = By.xpath("//select[@name='CITIZENSHIP']");
	public By SeniorCitizenProof = By.xpath("//select[@name='SC_PROOF']");
	public By Address1 = By.xpath("//input[@name='ADDRESS1']");
	public By Phone = By.xpath("//input[@name='MOBILE_NO']");
	public By Pin_Zip = By.xpath("//input[@name='ZIP']");
	public By browse = By.xpath("//input[@name='image']");
	public By Country_code = By.xpath("//select[@name='COUNTRY_CODE']");
	public By Submit = By.xpath("//*[@name='submit']");
	
	
	
	
	
	
	
}