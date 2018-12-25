package com.autodesk.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.autodesk.crm.accounts.AccountsPage;

public class TopMenu {
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void gotoHome()
	{
		
	}
	
	public void gotoContacts()
	{
		
	}

	public AccountsPage gotoAccounts()
	{
		Page.click("accountLink_XPATH");
		return new AccountsPage();
	}
	
	public void signOut()
	{
		
	}
}
