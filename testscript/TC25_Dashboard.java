package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.testsuite.TestsuiteBase;

public class TC25_Dashboard extends TestsuiteBase
{
	@Test
  public void dashboard()
  {
	  EmployeeloginHelper helper=new EmployeeloginHelper(driver);
	  helper.employeelogin();
	  driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
  }
}
