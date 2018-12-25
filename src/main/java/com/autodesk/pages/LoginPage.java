package com.autodesk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.autodesk.base.Page;

public class LoginPage extends Page{
	
	
	public ZohoAppPage doLoginIn(String userName,String passwor)
	{
		type("email_XPATH", userName);
		type("password_XPATH", passwor);
		click("submit_XPATH");
		return new ZohoAppPage();
	}

}
