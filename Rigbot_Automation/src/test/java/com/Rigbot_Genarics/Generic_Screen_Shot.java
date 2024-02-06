package com.Rigbot_Genarics;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Generic_Screen_Shot 
{

	public static void getphoto (WebDriver driver,ITestResult result)
	{
		Date d = new Date();
		String d1 = d.toString().replaceAll(":","-");

		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot/bug.jpeg");
		try {
			org.openqa.selenium.io.FileHandler.copy(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	

}