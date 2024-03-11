package com.crm.crm.genericUtils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImpUtils implements IRetryAnalyzer
{
int count=0;
int retryCount=3;
@Override
public boolean retry(ITestResult result)
{
if(count<retryCount)
{
	count++;
	return true;
}
	return false;
}

}
