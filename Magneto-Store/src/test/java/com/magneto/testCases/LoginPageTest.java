/**
 * 
 */
package com.magneto.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.magneto.base.BaseClass;
import com.magneto.pageObjects.HomePage;
import com.magneto.pageObjects.IndexPage;
import com.magneto.pageObjects.LoginPage;
import com.magneto.utility.Log;

/**
 * 
 */
public class LoginPageTest extends BaseClass {
	private IndexPage indexPage;
	private LoginPage loginPage;
	private HomePage homePage;
	
	@Parameters("browser")
	@BeforeMethod(groups= {"smoke","Sanity"})
	public void setup(String browser) {
		launchApp(browser); 
	}
	@AfterMethod(groups= {"smoke","Sanity"})
	public void tearDown() {
		getDriver().quit();
	}
	@Test(groups= {"smoke"})
	public void loginTest() throws Throwable  {
		Log.startTestCase("loginTest");
		
		indexPage= new IndexPage();
		Thread.sleep(3000);
		Log.info("user is going to click on SignIn");
		loginPage=indexPage.clickOnSignIn();
		Log.info("Enter Username and Password");
	    homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	    homePage.validateWelcome();
	    Log.info("Login is Sucess");
	    Log.endTestCase("loginTest");
		
	}

}
