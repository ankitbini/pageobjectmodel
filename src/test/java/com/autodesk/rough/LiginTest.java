package com.autodesk.rough;

import com.autodesk.base.Page;
import com.autodesk.crm.accounts.AccountsPage;
import com.autodesk.crm.accounts.CreateAccount;
import com.autodesk.pages.HomePage;
import com.autodesk.pages.LoginPage;
import com.autodesk.pages.ZohoAppPage;
import com.autodesk.pages.crm.CRMhomePage;

public class LiginTest {

	public static void main(String[] args) {
		HomePage home = new HomePage();
		LoginPage login = home.goToLogin();
		ZohoAppPage appPage = login.doLoginIn("akgankitsharma@gmail.com", "GHAR!wsXm2s");
		appPage.goToCRM();
		AccountsPage actPage = Page.menu.gotoAccounts();
		CreateAccount crtAccount = actPage.gotoCreateAccount();
		crtAccount.createAccount("Nishu");

	}

}
