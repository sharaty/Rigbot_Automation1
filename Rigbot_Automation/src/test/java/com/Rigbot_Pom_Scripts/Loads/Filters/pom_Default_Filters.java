package com.Rigbot_Pom_Scripts.Loads.Filters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_Default_Filters
{

	@FindBy(xpath="//span[.='Loads']")
	private WebElement load_menu_btn;

	
	@FindBy(xpath="//div[@id='filter-loads-advanced']")
	private WebElement Fltr;

	@FindBy(xpath="//p[.='Last 1 week Loads']")
	private WebElement oneweak;
	
	@FindBy(xpath="//p[contains(text(),'Last 15 Days  Loads')]")
	private WebElement days;

	@FindBy(xpath="//p[.='Last 1 Month  Loads']")
	private WebElement onemonth;

	@FindBy(xpath="//img[@style='margin: 0px 5px; cursor: pointer;']")
	private WebElement fltrcncl;
	
	
	@FindBy(xpath="//div[@role='checkbox']")
	private WebElement oneweekfltr;
	
	
	
	
	
	
	
	public pom_Default_Filters(WebDriver driver)
	{

		PageFactory.initElements(driver,this);
	}




	public WebElement LoadMenu()
	{
		return load_menu_btn;
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
