package com.Rigbot_Genarics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_dropdown_options
{
	public static Select select_class(WebElement ele)
	{
		Select sel = new Select(ele);
		return sel;
	}
	public static void Text(WebElement ele,String name)
	{

		select_class(ele).selectByVisibleText(name);
	}
	public static void index(WebElement ele,int number)
	{
		
		select_class(ele).selectByIndex(number);
	}
	public static void select_value(WebElement ele,String value)
	{
		select_class(ele).selectByValue(value);
	}
}
