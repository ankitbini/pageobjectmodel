package com.autodesk.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.autodesk.base.Page;
import com.autodesk.crm.accounts.AccountsPage;
import com.autodesk.crm.accounts.CreateAccount;
import com.autodesk.pages.ZohoAppPage;
import com.w2a.utilities.Utilities;

public class CreateAccountTest {
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String>data)
	{
		ZohoAppPage appPage = new ZohoAppPage();
		appPage.goToCRM();
		AccountsPage actPage = Page.menu.gotoAccounts();
		CreateAccount crtAccount = actPage.gotoCreateAccount();
		crtAccount.createAccount(data.get("accountname"));
		//Assert.assertTrue(false, "create account fails");
		
	}

}
