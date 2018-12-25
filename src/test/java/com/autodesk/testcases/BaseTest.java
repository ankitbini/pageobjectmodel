package com.autodesk.testcases;

import org.testng.annotations.AfterSuite;

import com.autodesk.base.Page;

public class BaseTest {
	
	@AfterSuite
	public void afterConfig()
	{
		//Page.quitBrowser();
	}

}
