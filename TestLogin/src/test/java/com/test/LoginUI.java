package com.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginUI extends BaseUI{
	
	@Test(testName = "getExcelData", dataProvider = ("loginData"), dataProviderClass  = ExcelDataSupllier.class)
	public void getExcelData(String Email, String Password)throws Exception {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("userEmail")).sendKeys(Email);
		driver.findElement(By.name("password")).sendKeys(Password);
		
		Assert.assertTrue(driver.findElement(By.id("home")).isDisplayed());
	    
		
		
	}

}
