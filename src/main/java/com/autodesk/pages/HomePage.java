package com.autodesk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.autodesk.base.Page;

public class HomePage extends Page{
	
	public LoginPage goToLogin()
	{
		click("loginlink_XPATH");
		System.out.println("clicked successfully");
		return new LoginPage();
	}
	
	public void goToSignUp()
	{
		driver.findElement(By.xpath("//a[text()='Sign up now']")).click();
	}
	
	public void goToSupport()
	{
		driver.findElement(By.xpath("//div[@class='zh-user-account']//a[text()='Support']")).click();
	}

}
