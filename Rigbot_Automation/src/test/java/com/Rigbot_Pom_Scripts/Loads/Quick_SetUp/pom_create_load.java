package com.Rigbot_Pom_Scripts.Loads.Quick_SetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Rigbot_Genarics.BaseClass;

public class pom_create_load
{
	//decleration
	@FindBy(xpath="//input[@id='username']") 
	private WebElement Log_un;                 // //element address


	@FindBy(xpath="//input[@name='password']")
	private WebElement Log_pwd;

	@FindBy(xpath="//button[.='Log In']")
	private WebElement login_button;

	@FindBy(xpath="//span[.='Loads']")
	private WebElement load_menu_btn;

	@FindBy(xpath="//span[.='New Load']")
	private WebElement newload_btn;        

	@FindBy(xpath="(//input[@id='orderNumber'])[1]")
	private WebElement ord_no;
    
	@FindBy(xpath = "//small[contains(text(),'order number is already taken')")
	private WebElement errortext;
	
	@FindBy(xpath="(//span[.='Select'])[1]")
	private WebElement click_cust;

	@FindBy(xpath="(//input[@autocomplete='off'])[3]")
	private WebElement custname;

	@FindBy(xpath="//li[@aria-label='sharat']")
	private WebElement slectcust;

	@FindBy(xpath="//input[@placeholder='Pickup On']")
	private WebElement pickupclick;

	@FindBy(xpath="//input[@placeholder='Delivery On']")
	private WebElement deliveryclick;

	@FindBy(xpath="(//input[@id='shipperConsigneeName'])[1]")
	private WebElement shipperadrs;

	@FindBy(xpath="(//input[@id='shipperConsigneeName'])[2]")
	private WebElement consigneeadrs;

	@FindBy(xpath="//input[@inputmode='decimal']")
	private WebElement finalamount;

	@FindBy(xpath="(//div[.='Select Driver'])[2]")
	private WebElement drivername;

	@FindBy(xpath="//input[@role='textbox']")
	private WebElement drvertextfield;

	@FindBy(xpath="(//div[@data-pc-section='checkbox'])[1]")
	private WebElement drvrname;

	@FindBy(xpath="(//span[.='Select Truck'])[1]")
	private WebElement truckclick;

	@FindBy(xpath="//li[@aria-label='Belown']")
	private WebElement truckname;
	
	@FindBy(xpath="//button[.='Save']")
	private WebElement savebtn;
	
	@FindBy(xpath = "//span[.=' Quick Setup']")
	private WebElement Quick_setup_tab;


	//initialisation
	
	public pom_create_load(WebDriver driver) // Note:-create constructor here with the above class name(ex;-create load) 
	{
		PageFactory.initElements(driver, this);
	}




	//Utilization
	
	public WebElement un_textfield()    // create method and utilizing the element address
	{ 
		return Log_un;               //returning the element address
	}

	public WebElement pwd_textfiled()
	{ 
		return  Log_pwd;
	}

	public WebElement login_btn()
	{
		return login_button;
	}

	public WebElement LoadMenu()
	{
		return load_menu_btn;
	}

	public WebElement NewLoad()
	{
		return newload_btn;
	}

	public WebElement orderNumber()
	{
		return ord_no;
	}
	
	public WebElement errorText()
	{
		return errortext;
	}
	public WebElement clickCustomerTextfield()
	{
		return click_cust;
	}

	public WebElement customerName()
	{
		return custname;
	}
	public WebElement selectCustomer()
	{
		return slectcust;
	}

	public WebElement pickupOnDateclick()
	{
		return pickupclick;
	}

	public WebElement deliveryOnDateclick()
	{
		return deliveryclick;
	}

	public WebElement shipperAddress()
	{
		return shipperadrs;
	}

	public WebElement consigneeAdress()
	{
		return consigneeadrs;
	}

	public WebElement Rate()
	{
		return finalamount;
	}

	public WebElement clickDriverDropdown()
	{
		return drivername;
	}

	public WebElement DriverdropdownText()
	{
		return drvertextfield;
	}

	public WebElement selectDriverName()
	{
		return drvrname;
	}
	
	public WebElement truckDropDownClick()
	{
		return truckclick;
	}

	public WebElement selectTruckname()
	{
		return truckname;
	}

	public WebElement saveButton()
	{
		return savebtn;
	}
	
	public WebElement Quick_setup()
	{
		return Quick_setup_tab;
	}







}
