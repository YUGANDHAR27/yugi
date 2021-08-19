package com.automationAspireportal.helper;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class Validationhelper 
{
	 WebDriver driver;
		ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
		ReadExcel excel= new ReadExcel(0);
		  public Validationhelper(WebDriver driver)
		  {
		this.driver = driver;
	}

 public void validation(String Actualres,String Expectedres) 
 {
	 Actualres=driver.findElement(By.xpath(read.timesheetalertmsg())).getText();
		 Expectedres="Timesheet saved successfully";
		assertEquals(Actualres, Expectedres);
		
 }
}
