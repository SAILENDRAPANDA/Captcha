package com.utill;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class JiraListener implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {

JiraPolicy jp=		arg0.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
boolean isTicketReady=jp.logTicketReady();	

if(isTicketReady) {
	System.out.println("is ticket ready for jira "+ isTicketReady);
	JiraServiceProvider jirasp=new JiraServiceProvider("https://mosai143.atlassian.net", "mosai858515@gmail.com", "3xi7bnig3p0xENSHSWhqEA0D", "JIRA");
	
String issueSummary=	arg0.getMethod().getConstructorOrMethod().getMethod().getName()+"got failed due to some issue";
String issueDes=arg0.getThrowable().getMessage()+"\n";
issueDes.concat(ExceptionUtils.getFullStackTrace(arg0.getThrowable()));

jirasp.createJiraTicket("Bug", issueSummary, issueDes,"");

}



	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
}
