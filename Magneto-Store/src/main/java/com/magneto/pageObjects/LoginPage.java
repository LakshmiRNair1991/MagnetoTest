package com.magneto.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magneto.action.Action;
import com.magneto.base.BaseClass;

public class LoginPage extends BaseClass{
	Action action=new Action();
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='send2']/span")
	private WebElement signin;
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public HomePage login(String uname, String pswd) throws Throwable {
		action.scrollByVisibilityOfElement(getDriver(), email);
		action.type(email, uname);
		action.type(password, pswd);
		String SignIn="SignIn";
		action.click(signin, SignIn);
		Thread.sleep(2000);
		return new HomePage();
	}
	

}
