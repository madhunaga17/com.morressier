package com.morressier.scripts;

import org.testng.annotations.Test;

import com.morressier.base.BaseTest;
import com.morressier.pages.DashboardPage;
import com.morressier.pages.EventPage;
import com.morressier.pages.SettingPage;

public class EventTest extends BaseTest{
	@Test
	public void search() throws InterruptedException{
		DashboardPage dPage = new DashboardPage(driver);
		EventPage ePage=new EventPage(driver);
		ePage.click_event();
		Thread.sleep(10000);
	}
	
}
