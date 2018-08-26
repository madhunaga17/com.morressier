package com.morressier.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.morressier.base.BasePage;

public class LoginPage extends BasePage{
	
	@FindBy(xpath="//h5[@class='style__NavText-taso50-2 sPGar Text__InnerTextComponent-ccn3q8-0 bdaShI']")
	private WebElement login;
	
	@FindBy(name="email")
	private WebElement txtemail;
	
	@FindBy(name="password")
	private WebElement txtPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnLogin;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void login(String un,String pw){
		login.click();
		txtemail.sendKeys(un);
		txtPassword.sendKeys(pw);
		btnLogin.click();
	}
}
