package com.autodesk.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.autodesk.pages.HomePage;
import com.autodesk.pages.LoginPage;
import com.autodesk.pages.ZohoAppPage;
import com.w2a.utilities.Utilities;

public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String, String>data)
	{
		HomePage home = new HomePage();
		LoginPage login = home.goToLogin();
		login.doLoginIn(data.get("username"), data.get("password"));
	}

}
