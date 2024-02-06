package com.Rigbot_Pom_Scripts.Invoice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_invoice 
{

	@FindBy(xpath="//span[.='Loads']")
	private WebElement load_menu_btn;

	@FindBy(xpath="//p[.='Invoice']")
	private WebElement invoicelnk;
	
	@FindBy(xpath="//span[.='Refresh']")
	private WebElement refresh;
	
	@FindBy(xpath="//input[@placeholder=' Search Customers name']")
	private WebElement serchcustmer;
	
	@FindBy(xpath="(//img[@style='height: 30px; width: 30px;'])[5]")
	private WebElement selectcust;
	
	@FindBy(xpath="//img[@alt='simple_refresh']")
	private WebElement simplerefrsh;
	
	@FindBy(xpath="//p[.='Invoiced']")
	private WebElement invoiced;
	
	@FindBy(xpath="//p[.='Un Invoiced']")
	private WebElement uninvoiced;
	
	@FindBy(xpath="//div[@class='applied-filter-dropdown']")
	private WebElement Fltr;

	@FindBy(xpath="/p[contains(text(),'previous 1 week Loads')]")    ////input[@placeholder='Search...']/../../div[2]/div[1]/p[2]
	private WebElement oneweak;
	
	@FindBy(xpath="//p[contains(text(),'previous 15 Days Loads')]")
	private WebElement days;

	@FindBy(xpath="//p[.='previous 1 Month Loads']")
	private WebElement onemonth;

	@FindBy(xpath="//img[@style='margin: 0px 5px; cursor: pointer;']")
	private WebElement fltrcncl;
	
	
	@FindBy(xpath="//div[@role='checkbox']")
	private WebElement oneweekfltr;
	
	
	
	public pom_invoice(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	

	public WebElement LoadMenu()
	{
		return load_menu_btn;
	}
	
	public WebElement InvoiceButton()
	{
		return invoicelnk;
		
	}
	
	public WebElement mainrefresh()
	{
		return refresh;
	}
	
	public WebElement searchcustomername()
	{
		return serchcustmer;
		
	}
	
	public WebElement SelectCustomer()
	{
		return selectcust;
		
	}
	
	public WebElement Simplerefresh()
	{
		return simplerefrsh ;
		
	}
	public WebElement InvoicedMajortab()
	{
		return invoiced;
		
	}
	
	public WebElement UninvoicedMajortab()
	{
		return uninvoiced;
		
	}
	
	public WebElement Filter_Button()
	{
		return Fltr;

	}
	
	public WebElement Last_One_Weak()
	{
		return oneweak;

	}
	
	public WebElement Last_15_Days()
	{
		return days;
	}
	
	public WebElement Lat_One_Month()
	{
		return onemonth;
	}

	public WebElement Filter_Cancel_Icon()
	{
		return fltrcncl;
	
	}
	
	public  WebElement oneweakfilter_count()
	
	{
		return oneweekfltr;
		
	}
	
}
