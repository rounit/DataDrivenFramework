package com.rs.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.rs.base.TestBase;

public class BankManagerLoginTest extends TestBase 
{
	
	@Test
	public void bankManagerloginTest() throws InterruptedException, IOException
	{
		verifyEquals("abc","xyz");
		Thread.sleep(3000);
		click("bmlBtn");
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))),"Login Not Successful");
		
		
	}

}
