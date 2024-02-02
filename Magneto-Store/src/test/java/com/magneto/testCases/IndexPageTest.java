package com.magneto.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.magneto.base.BaseClass;
import com.magneto.pageObjects.HomePage;
import com.magneto.pageObjects.IndexPage;
import com.magneto.pageObjects.LoginPage;
import com.magneto.utility.Log;

public class IndexPageTest extends BaseClass{
	private IndexPage indexPage;
	
	@Parameters("browser")
	@BeforeMethod(groups= {"smoke","Sanity"})
	public void setup(String browser) {
		launchApp(browser); 
	}
	@AfterMethod(groups= {"smoke","Sanity"})
	public void tearDown() {
		getDriver().quit();
	}
	@Test(groups= {"smoke","Sanity"})
	public void VerifySignIn() throws Throwable  {
		Log.startTestCase("VerifySignIn");
		Log.info("Verify SignIn button is displayed");
		indexPage= new IndexPage();
		indexPage.signInIsdisplayed();
		Log.info("SignIn button is displayed");
	    Log.endTestCase("VerifySignIn");
		
	}
	@Test(groups = "Smoke")
	public void verifyTitle() {
		Log.startTestCase("verifyTitle");
		String actTitle=indexPage.getTitle();
		Assert.assertEquals(actTitle, "Home Page");
		Log.endTestCase("verifyTitle");
	}

}
