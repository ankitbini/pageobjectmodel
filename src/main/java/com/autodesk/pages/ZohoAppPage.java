package com.autodesk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.autodesk.base.Page;
import com.autodesk.pages.crm.CRMhomePage;

public class ZohoAppPage extends Page{
	

	public CRMhomePage goToCRM()
	{
		WebElement cl = driver.findElement(By.xpath("//button[@class='close-btn']"));
		if(cl.isDisplayed())
		{
			cl.click();
		}
		click("crmLINK_XPATH");
		return new CRMhomePage();
	}
}
