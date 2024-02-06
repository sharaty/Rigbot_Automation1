package com.Rigbot_Genarics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Test 
{
public  void base_method(WebDriver driver)
{
	
	PageFactory.initElements(driver,this);
}
}
