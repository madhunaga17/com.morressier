package com.morressier.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.morressier.base.BasePage;

public class SearchPage extends BasePage{
	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@id='HINT_SEARCH']")
	private WebElement search;
	
	@FindBy(xpath="//div[@class='style__SearchBarExpandedContainer-taso50-9 jTASKx']//*[@class='undefined style__SearchIcon-s1dykx0t-1 eyVOWW']")
	private WebElement search_Click;

	public void click_Search(){
		search.click();
		search.sendKeys("ESPID");
		search.sendKeys(Keys.ENTER);
	}

}
