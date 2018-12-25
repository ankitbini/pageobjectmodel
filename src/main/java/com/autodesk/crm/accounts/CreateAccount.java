package com.autodesk.crm.accounts;

import org.openqa.selenium.By;

import com.autodesk.base.Page;

public class CreateAccount extends Page{
	
	public void createAccount(String accountName)
	{
		type("accountName_XPATH", accountName);
	}

}
