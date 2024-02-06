
package com.Rigbot_Genarics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class javascript_class extends BaseClass
{
	public static JavascriptExecutor typecast()
	{

		JavascriptExecutor js =(JavascriptExecutor)driver;
		return js;
	}
	public static void scroll_down_using_add (WebElement ele)
	{

		typecast().executeScript("arguments[0].scrollIntoView();",ele);
	}
	public static void scroll_down_using_loc(int x,int y)
	{

		typecast().executeScript("window.scrollBy("+x+","+y+")");
	}

}
