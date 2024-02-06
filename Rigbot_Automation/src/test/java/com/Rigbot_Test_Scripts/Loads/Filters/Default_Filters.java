package com.Rigbot_Test_Scripts.Loads.Filters;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Rigbot_Genarics.BaseClass;
import com.Rigbot_Pom_Scripts.Loads.Filters.pom_Default_Filters;
import com.aventstack.extentreports.Status;


@Listeners(com.Rigbot_Genarics.Listener_Class.class)
public class Default_Filters extends BaseClass
{
	
	@Test()
	public static void test_Load_Screen_Default_filters() throws InterruptedException
	{
		pom_Default_Filters fl = new pom_Default_Filters(driver);
		fl.LoadMenu().click();
		Thread.sleep(2000);
		fl.Filter_Button().click();
		Thread.sleep(2000);
		test.log(Status.PASS, "Filter button is working");
		fl.Last_One_Weak().click();
		Thread.sleep(2000);
		
		// counting the loads for one weak
		
		List<WebElement> one_weak_Loads = driver.findElements(By.xpath("//div[@role='checkbox']"));
		int count=0;
		for (WebElement checkbox : one_weak_Loads) 
		{
		
			count = one_weak_Loads.size();	
			
		}
		test.log(Status.PASS, "one weak Filter button is working");
		test.log(Status.INFO,"the last one weak Loads count is "+ count);
		fl.Filter_Cancel_Icon().click();
		Thread.sleep(2000);
		fl.Filter_Button().click();
		Thread.sleep(2000);
		fl.Last_15_Days().click();
		Thread.sleep(2000);
		
		// counting the loads for last 15 days
		
		List<WebElement> fifteen_days_Loads = driver.findElements(By.xpath("//div[@role='checkbox']"));
		int count1=0;
		for (WebElement checkbox : fifteen_days_Loads) 
		{
		
			count1 = fifteen_days_Loads.size();	

		}	
		test.log(Status.PASS, "Last 15 days Filter button is working");
		test.log(Status.INFO,"the last 15 Days Loads count is "+ count1);
		
		fl.Filter_Cancel_Icon().click();
		Thread.sleep(2000);
		fl.Filter_Button().click();
		Thread.sleep(2000);
		fl.Lat_One_Month().click();
		Thread.sleep(2000);
		
		
		// counting the loads for last One Month
		
		List<WebElement> Last_One_Month = driver.findElements(By.xpath("//div[@role='checkbox']"));
		int count2=0;
		for (WebElement checkbox : Last_One_Month) 
		{
		
			count2 = Last_One_Month.size();	

		}
		test.log(Status.PASS, "Last One Month Filter button is working");
		test.log(Status.INFO,"the last One Month Loads count is "+ count2);
		fl.Filter_Cancel_Icon().click();

	}
}
