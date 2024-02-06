package com.Rigbot_Genarics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Extent_Report_Screen_Shot extends BaseClass
{
	public static String getScreenshot() 
	{
		String path = "./screenshot/bug.jpeg";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(path);


		try {
			org.openqa.selenium.io.FileHandler.copy(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "." +path;
	}
}

