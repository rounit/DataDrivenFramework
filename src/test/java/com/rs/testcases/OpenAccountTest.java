package com.rs.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rs.base.TestBase;
import com.rs.utilities.TestUtil;

public class OpenAccountTest extends TestBase
{
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	
	public void openAccountTest(Hashtable<String,String> data) throws InterruptedException
	{
		
		if(!TestUtil.isTestRunnable("openAccountTest", excel))
		 {
			 throw new SkipException("Skipping the test " +"openAccountTest".toUpperCase() + " as the Run mode is NO");
		 }
		click("openaccount");
		select("customer",data.get("customer"));
		select("currency",data.get("currency"));
		click("process");
		Thread.sleep(2000);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		alert.accept();
		
	}
	
	

	
}
