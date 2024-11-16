package com.comcast.crmlistenerutility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListenerImp implements IRetryAnalyzer{
	
	int count=0;
	int limtCount=5;

	@Override
	public boolean retry(ITestResult result) {
		if(count<limtCount) {
			count++;
			return true;
		}
		return false;
	}
	
	

}
