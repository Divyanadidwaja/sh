package com.crm.crm.genericUtils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class listenerUtils implements ITestListener
{
ExtentReports report;
ExtentTest test;
	@Override
	public void onTestStart(ITestResult result)
	{
		//Exection starts from here
		String MethodName=result.getMethod().getMethodName();
		 test = report.createTest(MethodName);
		 Reporter.log(MethodName+"---> Execution starts");
		 
		}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.PASS, MethodName="---->Passes");
		 Reporter.log(MethodName+"---> Testscript Executed sucess");
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		 
	
		try {
			
			String MethodName=result.getMethod().getMethodName();
			String Screenshot = WebdriverUtils.getScreenShot(Baseclass.sdriver, MethodName);
			test.log(Status.FAIL, MethodName="---->Failed");
			test.log(Status.FAIL, result.getThrowable());
			 Reporter.log(MethodName+"--->Failed");
			 test.addScreenCaptureFromPath(Screenshot);
			 
			
			
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		String MethodName=result.getMethod().getMethodName();
		
		test.log(Status.FAIL, MethodName="---->Failed");
		test.log(Status.FAIL, result.getThrowable());
		 Reporter.log(MethodName+"--->Failed");
	
	}

	

	@Override
	public void onStart(ITestContext context)
	{
	 ExtentSparkReporter htmlreport = new ExtentSparkReporter("./ExtentReport/report.html");
	 htmlreport.config().setDocumentTitle("Sales And Inventory");
	 htmlreport.config().setTheme(Theme.STANDARD);
	 htmlreport.config().setReportName("Divya");
	 
	 report=new ExtentReports();
	 report.attachReporter(htmlreport);
	 
	 report.setSystemInfo("Base platform", "windows");
	 report.setSystemInfo("Base browser", "chrome");
	 report.setSystemInfo("Base URL", "http://rmgtestingserver/");
	 report.setSystemInfo("Reporter Name", "Divya");
	 

	}            

	@Override
	public void onFinish(ITestContext context) {

report.flush();
	}



}
