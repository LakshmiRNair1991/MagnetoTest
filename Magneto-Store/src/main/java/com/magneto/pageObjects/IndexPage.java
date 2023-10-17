package com.magneto.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magneto.action.Action;
import com.magneto.base.BaseClass;

public class IndexPage extends BaseClass{
	Action action=new Action();
	@FindBy(xpath="(//*[@class='authorization-link']/a)[1]")
	private WebElement signIn;
	
	public IndexPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void signInIsdisplayed() {
		action.isDisplayed(getDriver(), signIn);
	}
	
	public LoginPage clickOnSignIn() throws Throwable {
		String SignIn="SignIn";
		action.click(signIn,SignIn);
		return new LoginPage();
	}
	public String getTitle() {
		String magnetoTite=getDriver().getTitle();
		return magnetoTite;
	}
	

}
