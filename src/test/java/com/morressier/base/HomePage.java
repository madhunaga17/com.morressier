package com.morressier.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.Utility;

public abstract class HomePage extends BasePage{

	@FindBy(id="HINT_PROFILE")
	private WebElement qaAccount_Menu;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	private WebElement logout;
	
	@FindBy(xpath="//a[contains(text(),'Settings')]")
	private WebElement setting_Menu;
	
	
	
	
	public void click_Leave_Menu(){
		qaAccount_Menu.click();
	}
	
	
	public void clickvacancy_Menu(){
		setting_Menu.click();
	}
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	
	
	public void logout(){
		//welcome.click();
		Utility.clickUsingJS(driver, qaAccount_Menu);
		waitAndClick(logout);
		
	}
	
	
}
