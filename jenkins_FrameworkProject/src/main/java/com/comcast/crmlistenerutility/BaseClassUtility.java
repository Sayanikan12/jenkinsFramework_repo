package com.comcast.crmlistenerutility;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClassUtility {
	
	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	public void configBS() {
		System.out.println("execute BS");
	}
	
	@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void configAS() {
		System.out.println("execute AS");
	}
	
	
	@BeforeClass(groups= {"smokeTest","regressionTest"})
	public void configBC() {
		System.out.println("execute BC");
	}
	
	@AfterClass(groups= {"smokeTest","regressionTest"})
	public void configAC() {
		System.out.println("execute AC");
	}
	
	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void configBM() {
		System.out.println("execute BM");
	}
	
	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void configAM() {
		System.out.println("execute AM");
	}

}
