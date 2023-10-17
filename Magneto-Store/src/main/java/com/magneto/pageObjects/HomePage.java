package com.magneto.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magneto.action.Action;
import com.magneto.base.BaseClass;

public class HomePage extends BaseClass{
	Action action=new Action();
	@FindBy(xpath="(//*[@class='greet welcome']/span)[1]")
	private WebElement welcome;
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	public boolean validateWelcome() throws Throwable {
		return action.isDisplayed(getDriver(),welcome);
	}
	

}
