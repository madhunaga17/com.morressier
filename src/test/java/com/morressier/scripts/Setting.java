package com.morressier.scripts;

import org.testng.annotations.Test;

import com.morressier.base.BaseTest;
import com.morressier.pages.DashboardPage;
import com.morressier.pages.SearchPage;
import com.morressier.pages.SettingPage;

public class Setting extends BaseTest{
	@Test
	public void search() throws InterruptedException{
		DashboardPage dPage = new DashboardPage(driver);
		dPage.click_qaAccount_Menu();
		dPage.click_setting_Menu();
		SettingPage setPage=new SettingPage(driver);
		setPage.notification();

	}
}
