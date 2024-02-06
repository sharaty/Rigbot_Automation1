package com.Rigbot_Test_Scripts.Invoice;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Rigbot_Genarics.BaseClass;
import com.Rigbot_Pom_Scripts.Invoice.pom_invoice;
import com.aventstack.extentreports.Status;


@Listeners(com.Rigbot_Genarics.Listener_Class.class)
public class Create_Invoice extends BaseClass
{
	@Test
	public void test_invoice() throws InterruptedException 
	{
		pom_invoice inv = new pom_invoice(driver);
		inv.LoadMenu().click();
		Thread.sleep(2000);
		inv.mainrefresh().click();
		Thread.sleep(2000);
		WebElement inv_btn = inv.InvoiceButton();
		if (inv_btn.isEnabled())
		{

			inv_btn.click();
			test.log(Status.PASS,"invoice page is successfully opened");
		}
		else
		{
			test.log(Status.FAIL,"invoice page is not opened");
		}
		Thread.sleep(2000);

		test.log(Status.PASS,"Invoice page is successfully refreshed");
		WebElement c = inv.searchcustomername();
		if(c.isEnabled())
		{
			c.click();
			Thread.sleep(2000);
			c.sendKeys("sharat");
			Thread.sleep(2000);
		}
		else
		{
			test.log(Status.FAIL,"customer serchfield is not working");
		}
		Thread.sleep(2000);
		WebElement select_Customer = inv.SelectCustomer();
		if(select_Customer.isEnabled())
		{
			select_Customer.click();
			test.log(Status.PASS,"customer name  is selected");

		}
		else
		{
			test.log(Status.FAIL,"customer name is not selected");
		}

		Thread.sleep(2000);
		inv.Simplerefresh();
		test.log(Status.INFO,"Customer Load invoices refreshed successfully");
		Thread.sleep(2000);
		inv.InvoicedMajortab().click();
		Thread.sleep(2000);
		inv.Simplerefresh().click();
		Thread.sleep(2000);
		inv.UninvoicedMajortab().click();
		Thread.sleep(2000);
		inv.Simplerefresh().click();
		Thread.sleep(2000);


	}

}
