package com.morressier.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.morressier.base.BasePage;

public class EventPage extends BasePage{
	
	public EventPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[contains(text(),'18 / Discontinuation of TKI, in patients with CML')]")
	private WebElement event;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[4]/a[1]")
	private WebElement stroke;

	public void click_event() throws InterruptedException{
		event.click();
		Thread.sleep(10000);
		for(int i=0; i<=5; i++){
		stroke.click();
		}
	}
}
