package com.autodesk.crm.accounts;

import org.openqa.selenium.By;

import com.autodesk.base.Page;

public class AccountsPage extends Page{
	
	public CreateAccount gotoCreateAccount()
	{
		click("createAccountBtn_XPATH");
		return new CreateAccount();
	}
	
	public void gotoImportAccount()
	{
		
	}

}
