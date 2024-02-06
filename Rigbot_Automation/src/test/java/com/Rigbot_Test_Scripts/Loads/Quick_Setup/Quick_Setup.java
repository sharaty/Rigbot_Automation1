package com.Rigbot_Test_Scripts.Loads.Quick_Setup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.bouncycastle.pkcs.bc.BcPKCS12MacCalculatorBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Rigbot_Genarics.BaseClass;
import com.Rigbot_Genarics.Extent_Report_Screen_Shot;
import com.Rigbot_Genarics.Generic_Screen_Shot;
import com.Rigbot_Genarics.Listener_Class;
import com.Rigbot_Genarics.Test_DataByPropertyFile;
import com.Rigbot_Genarics.javascript_class;
import com.Rigbot_Pom_Scripts.Loads.Quick_SetUp.pom_create_load;
import com.aventstack.extentreports.Status;


@Listeners(com.Rigbot_Genarics.Listener_Class.class)

public class Quick_Setup extends BaseClass 
{
	@Test()
	public  void test_Quick_Setup() throws InterruptedException, AWTException
	{
		pom_create_load PomQuickSetup = new pom_create_load(driver);
		Thread.sleep(3000);

		WebElement L = PomQuickSetup.LoadMenu();
		if(L.isEnabled())
		{
			L.click();
			test.log(Status.PASS,"The load menu is working fine");
		}
		else 
		{
			test.log(Status.FAIL,"The Load menu is not working ");
		}
		Thread.sleep(3000);

		WebElement NLoad = PomQuickSetup.NewLoad();
		if(NLoad.isEnabled())
		{
			NLoad.click();
			test.log(Status.PASS,"the new load button is working fine");
		}
		else
		{
			test.log(Status.FAIL,"the new load button is not working fine");
		}
		Thread.sleep(3000);

		WebElement orderNumber = PomQuickSetup.orderNumber();
		if(orderNumber.isEnabled())
		{

			orderNumber.click();
			Thread.sleep(3000);
			test.log(Status.PASS,"The order number textfield is selected");
			//Thread.sleep(3000);
			orderNumber.sendKeys(Test_DataByPropertyFile.getdata("Order/Load"));
			Thread.sleep(3000);
			test.log(Status.PASS,("the Order no is entered"));

		}
		else
		{
			test.log(Status.FAIL,"The order number textfield is not selected");

		}
		Thread.sleep(3000);
		WebElement custmrfield = PomQuickSetup.clickCustomerTextfield();
		if(custmrfield.isEnabled())
		{
			custmrfield.click();
			test.log(Status.PASS,("the cutsomer name textfield is clicked"));
		}
		else
		{
			test.log(Status.FAIL,("the cutsomer name textfield is not clicked"));
		}
		Thread.sleep(3000);

		WebElement cust_text = PomQuickSetup.customerName();

		if(cust_text.isEnabled())
		{
			cust_text.click();
			Thread.sleep(3000);
			cust_text.sendKeys(Test_DataByPropertyFile.getdata("Customer/Broker"));
			test.log(Status.PASS,("the customer name is entered"));
		}
		else
		{
			test.log(Status.FAIL,"the customer name is not entered");
		}


		Thread.sleep(5000);
		PomQuickSetup.selectCustomer().click();
		test.log(Status.INFO,("the customer is selected"));
		javascript_class.scroll_down_using_add(PomQuickSetup.truckDropDownClick());
		Thread.sleep(3000);
		PomQuickSetup.pickupOnDateclick().click();
		Thread.sleep(3000);
		test.log(Status.INFO, ("the pickupon date textfiled is clickable"));
		PomQuickSetup.pickupOnDateclick().clear();
		Thread.sleep(3000);
		PomQuickSetup.pickupOnDateclick().sendKeys(Test_DataByPropertyFile.getdata("PickupDate"));
		test.log(Status.INFO,("the pickup date is entered"));
		Thread.sleep(3000);
		PomQuickSetup.deliveryOnDateclick().click();
		Thread.sleep(3000);
		test.log(Status.INFO, ("the delivery on date textfiled is clickable"));
		PomQuickSetup.deliveryOnDateclick().clear();
		Thread.sleep(3000);
		PomQuickSetup.deliveryOnDateclick().sendKeys(Test_DataByPropertyFile.getdata("DeliveryDate"));
		test.log(Status.INFO,("the delivery date is entered"));
		Thread.sleep(3000);
		PomQuickSetup.shipperAddress().click();
		Thread.sleep(3000);
		test.log(Status.INFO,("the shipper adress textfiled is clickable"));
		PomQuickSetup.shipperAddress().sendKeys(Test_DataByPropertyFile.getdata("ShipperName"));
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		test.log(Status.INFO,("the shipper name is entered"));
		PomQuickSetup.consigneeAdress().click();
		test.log(Status.INFO,("the Consignee adress textfiled is clickable"));
		Thread.sleep(3000);
		PomQuickSetup.consigneeAdress().sendKeys(Test_DataByPropertyFile.getdata("ConsigneeName"));
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		test.log(Status.INFO,("the consignee name is entered"));
		PomQuickSetup.Rate().click();
		Thread.sleep(3000);
		PomQuickSetup.Rate().sendKeys(Test_DataByPropertyFile.getdata("FinalRate"));
		Thread.sleep(3000);
		PomQuickSetup.clickDriverDropdown().click();
		Thread.sleep(3000);
		PomQuickSetup.DriverdropdownText().sendKeys(Test_DataByPropertyFile.getdata("Drivername"));
		Thread.sleep(3000);
		PomQuickSetup.selectDriverName().click();
		Thread.sleep(3000);
		//javascript_class.scroll_down_using_add(PomQuickSetup.truckDropDownClick());
		Thread.sleep(3000);
		PomQuickSetup.truckDropDownClick().click();
		Thread.sleep(3000);
		//PomQuickSetup.truckDropDownClick().sendKeys(Test_DataByPropertyFile.getdata("Truckname"));
		//Thread.sleep(3000);
		PomQuickSetup.selectTruckname().click();
		Thread.sleep(3000);
		WebElement saveButton = PomQuickSetup.saveButton();
		if(saveButton.isEnabled())
		{
			saveButton.click();
			test.log(Status.INFO,"save button is working");

		}
		else
		{test.log(Status.FAIL,"save button is not working");

		}
		Thread.sleep(3000);
		
		
		if (driver.getPageSource().contains("Notes")) 	
		{
		test.log(Status.FAIL, "The load is not created Because of order/Load number ,Customer/Broker names and pickup date greater than the Dropoff date Conditions are Failed");
		
		Thread.sleep(2000);
		Extent_Report_Screen_Shot.getScreenshot();
		
		}
		else
		{
			test.log(Status.PASS,"the Load is created Successfully");
		}

	}



}

