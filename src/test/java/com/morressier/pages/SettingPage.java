package com.morressier.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.morressier.base.BasePage;

public class SettingPage extends BasePage {
	public SettingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//p[contains(text(),'Notify me with important information on my confere')]")
	private WebElement conferenceUpdates_Select;
	
	@FindBy(xpath="//p[contains(text(),'Notify me with relevant research')]")
	private WebElement relevantContent_Select;

	@FindBy(xpath="//p[contains(text(),'Notify me with updates from Morressier')]")
	private WebElement productUpdate_Select;
	
	public void notification(){
		if(!conferenceUpdates_Select.isSelected()){
			conferenceUpdates_Select.click();	
		}
		if(!relevantContent_Select.isSelected()){
			relevantContent_Select.click();	
		}
		if(!productUpdate_Select.isSelected()){
			productUpdate_Select.click();	
		}
		
		
		
	}

}
