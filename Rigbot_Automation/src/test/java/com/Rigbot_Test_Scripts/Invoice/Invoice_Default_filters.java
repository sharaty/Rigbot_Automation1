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
		Thread.sleep(2000);
		fl.InvoiceButton().click();
		Thread.sleep(2000);
		fl.SelectCustomer().click();
		Thread.sleep(2000);
		fl.Filter_Button().click();
		test.log(Status.PASS,"Invoice Filter button is working");
		Thread.sleep(2000);
		WebDriverWait wait =new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//p[contains(text(),'previous 1 week Loads')]")))).click();
		test.log(Status.PASS,"Invoice Filter button is working");
		Thread.sleep(2000);
		fl.Filter_Cancel_Icon().click();
		Thread.sleep(2000);
		fl.Filter_Button().click();
		Thread.sleep(10000);
		//wait.until(ExpectedConditions.elementToBeClickable(fl.Last_15_Days();
		fl.Last_One_Weak().click();
		test.log(Status.PASS,"one weak Filter succesfully applied");
		Thread.sleep(10000);
		fl.Filter_Cancel_Icon().click();
		Thread.sleep(2000);
		fl.Filter_Button().click();
		Thread.sleep(10000);
		fl.Last_15_Days().click();
		Thread.sleep(2000);
		test.log(Status.PASS,"15 days Filter succesfully applied");
		fl.Filter_Cancel_Icon().click();
		Thread.sleep(2000);
		fl.Filter_Button().click();
		Thread.sleep(10000);
		fl.Lat_One_Month().click();
		Thread.sleep(2000);
		test.log(Status.PASS,"one month Filter succesfully applied");
		fl.Filter_Cancel_Icon().click();
		Thread.sleep(2000);
	}
}
