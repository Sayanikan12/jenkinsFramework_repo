package com.comcast.crmlistenerutility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class ListImpclass implements ITestListener, ISuiteListener {
	WebDriver driver;

	public void onStart(ISuite suite) {
		System.out.println("Report configuration");

	}

	public void onFinish(ISuite suite) {
		System.out.println("Report backup");
	
	}
	public void onStart(ITestContext itc) {
			System.out.println("=====" + itc.getName()+"===START===");
	}
	
	public void onFinish(ITestContext itts) {
		System.out.println("===Execution End==");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("=====" + result.getMethod().getMethodName() + "===START===");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("=====" + result.getMethod().getMethodName() + "===END===");
	}

   public void onTestFailure(ITestResult result) {
	String srcFile = result.getMethod().getMethodName();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File temp=new File("./resourse/"+srcFile+".png");
	try {
		FileHandler.copy(src, temp);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	/*WebDriverUtility wLib=new WebDriverUtility();
	String time = new Date().toString().replace(" ", "_").replace(":", "_");
	try {
		wLib.toTakeScreenshotofPage(BaseClass.sdriver, srcFile+time);
	} catch (IOException e) {
		
		e.printStackTrace();
	}*/
	
	
	
}

}
