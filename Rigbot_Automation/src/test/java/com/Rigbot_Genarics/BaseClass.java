package com.Rigbot_Genarics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Rigbot_Pom_Scripts.Loads.Quick_SetUp.pom_create_load;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass
{
	public static WebDriver driver;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports reports;
	public static ExtentTest test;
	@BeforeTest
	public void report()
	{
		reporter = new ExtentHtmlReporter("./extent/report.html");
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		test = reports.createTest("Test_Case_Repot");/// test report name
	}
	@BeforeClass
	public void openbrowser()
	{
		//	    WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver1.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		test.log(Status.PASS,"browser is launched");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void login() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.get("https://app-test.rigbot.com");
		pom_create_load load=new pom_create_load(driver);
		Thread.sleep(2000);
		test.log(Status.INFO,("the login page is displayed "));
		load.un_textfield().sendKeys("automation");
		//test.log(Status.INFO,("the textfield is working"));
		Thread.sleep(2000);
		load.pwd_textfiled().sendKeys("123");
		Thread.sleep(2000);
		load.login_btn().click();
		test.log(Status.PASS,("login successfully"));

	}
	@AfterMethod
	public void logout()
	{

	}
	@AfterClass
	public void closeapp() throws InterruptedException
	{
		Thread.sleep(9000);
		driver.quit();
	}
	@AfterTest
	public void reclose()
	{
		reports.flush();
	}
}

