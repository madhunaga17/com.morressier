package com.morressier.scripts;

import org.testng.annotations.Test;

import com.morressier.base.BaseTest;
import com.morressier.pages.DashboardPage;
import com.morressier.pages.SearchPage;


public class SearchTest extends BaseTest{
	@Test
	public void search() throws InterruptedException{
		DashboardPage dPage = new DashboardPage(driver);
		SearchPage sPage=new SearchPage(driver);
		Thread.sleep(10000);
		sPage.click_Search();
		Thread.sleep(10000);

	}
}
