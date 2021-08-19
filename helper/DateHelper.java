package com.automationAspireportal.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class DateHelper
{
	WebDriver driver;
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	public DateHelper(WebDriver driver)
	{
		this.driver = driver;
	}	  
	public void selectdate()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime presentdate = LocalDateTime.now();
		WebElement startdate = driver.findElement(By.xpath(read.clickonstartdate()));
		startdate.sendKeys(dtf.format(presentdate));
		startdate.sendKeys(Keys.ENTER);
		WebElement endate = driver.findElement(By.xpath(read.clickonenddate()));	
		endate.sendKeys(dtf.format(presentdate.plusDays(3)));
		endate.sendKeys(Keys.ENTER);
	}
	public void selectdatemorethan31days()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		WebElement startdate = driver.findElement(By.xpath(read.clickonstartdate()));
		startdate.sendKeys(dtf.format(now));
		startdate.sendKeys(Keys.ENTER);
		WebElement endate = driver.findElement(By.xpath(read.clickonenddate()));	
		endate.sendKeys(dtf.format(now.plusDays(34)));
		endate.sendKeys(Keys.ENTER);

	}
	public void selectdateforshifts()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		WebElement startdate = driver.findElement(By.xpath(read.clickonstartdate()));
		startdate.sendKeys(dtf.format(now));
		startdate.sendKeys(Keys.ENTER);
		WebElement endate = driver.findElement(By.xpath(read.clickonenddate()));	
		endate.sendKeys(dtf.format(now.plusDays(1)));
		endate.sendKeys(Keys.ENTER);

	}
	public void selectdateforallemployeesstab()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		WebElement startdate = driver.findElement(By.xpath(read.allstartdate()));
		startdate.sendKeys(dtf.format(now));
		startdate.sendKeys(Keys.ENTER);
		WebElement endate = driver.findElement(By.xpath(read.allenddate()));	
		endate.sendKeys(dtf.format(now.plusDays(5)));
		endate.sendKeys(Keys.ENTER);

	}
	public void timesheetsenttab()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		WebElement startdate = driver.findElement(By.xpath("//input[@id='teStartDate']"));
		startdate.sendKeys(dtf.format(now));
		startdate.sendKeys(Keys.ENTER);
		WebElement endate = driver.findElement(By.xpath("//input[@id='teEndDate']"));	
		endate.sendKeys(dtf.format(now.plusDays(5)));
		endate.sendKeys(Keys.ENTER);

	}


	//input[@id='allstartDate']


	////    public void dateMorethan31days()
	////    {
	////    	WebElement startdate = driver.findElement(By.id(read.clickonstartdate()));
	////		startdate.sendKeys("26/07/2021");
	////		startdate.sendKeys(Keys.ENTER);
	////		WebElement endate = driver.findElement(By.id(read.clickonenddate()));
	////		endate.sendKeys("30/08/2021");
	////		endate.sendKeys(Keys.ENTER);
	//

	// public void picdate() {
	//
	//        //Add one Day to the current date
	//        LocalDate currentdDate1 =  LocalDate.now();
	//        LocalDate currentDatePlus1 = currentdDate1.plusDays(1);
	//        System.out.println("Adding 1 day to current date: "+currentDatePlus1);
	// 
	//        //Add number of Days to the current date
	//        LocalDate currentdDate7 =  LocalDate.now();
	//        LocalDate currentDatePlus7 = currentdDate7.plusDays(1);
	//        System.out.println("Adding 7 days to the current date: "+currentDatePlus7);
	//    
	//}



}
