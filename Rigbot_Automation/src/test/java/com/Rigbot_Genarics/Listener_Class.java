package com.Rigbot_Genarics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_Class extends BaseClass implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TEST CASE IS STARTED:"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TEST CASE IS SUCCESS:"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("TEST CASE IS FAILED:"+result.getName());
		Generic_Screen_Shot.getphoto(this.driver, result);
		Extent_Report_Screen_Shot.getScreenshot();
		
		try {
			test.addScreenCaptureFromPath(getScreenshot());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	
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
