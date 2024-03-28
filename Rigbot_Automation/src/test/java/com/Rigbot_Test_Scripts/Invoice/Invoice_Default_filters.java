package com.Rigbot_Test_Scripts.Invoice;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Rigbot_Genarics.BaseClass;
import com.Rigbot_Pom_Scripts.Invoice.pom_invoice;
import com.aventstack.extentreports.Status;


@Listeners(com.Rigbot_Genarics.Listener_Class.class)
public class Invoice_Default_filters extends BaseClass
{
	@Test
	public static void test_Invoice_Default_filters() throws InterruptedException
	{
		pom_invoice fl = new pom_invoice(driver);
		fl.LoadMenu().click();
		test.log(Status.PASS,"Load Menu Button is working");
		Thread.sleep(2000);
		fl.InvoiceButton().click();
		test.log(Status.PASS,"Invoice button is working");
		Thread.sleep(2000);
		fl.SelectCustomer().click();
		Thread.sleep(2000);
		fl.Filter_Button().click();
		test.log(Status.PASS,"Invoice Filter button is working");
		Thread.sleep(2000);
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(fl.Last_One_Weak())).click();
		test.log(Status.PASS,"One Week Filter is succesfully applied");
		Thread.sleep(2000);
		fl.Filter_Cancel_Icon().click();
		Thread.sleep(2000);
		fl.Filter_Button().click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(fl.Last_15_Days())).click();
		test.log(Status.PASS,"15 days Filter is succesfully applied");
		Thread.sleep(3000);
		fl.Filter_Cancel_Icon().click();
		Thread.sleep(2000);
		fl.Filter_Button().click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(fl.Lat_One_Month())).click();
		test.log(Status.PASS,"one month Filter succesfully applied");
		Thread.sleep(2000);
		fl.Filter_Cancel_Icon().click();
		Thread.sleep(2000);
	}
}
