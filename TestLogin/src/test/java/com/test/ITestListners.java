package com.test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

//@Listeners({TestImplemnt.class, BaseUI.class}) To use multiple calss a listener
public class ITestListners extends BaseUI implements ITestListener{
	
 //To get this onTestFailure=> Click here> Source>override/ implement methods
	@Override
	public void onTestFailure(ITestResult result) {
	  try {
		  
		captureScreen(result.getTestContext().getName()+"_"+result.getMethod());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	

}
