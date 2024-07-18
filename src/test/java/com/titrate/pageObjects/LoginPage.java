package com.titrate.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userid")
	WebElement txtUserName;

	@FindBy(id="password")
	WebElement txtPassword;

	@FindBy(xpath="//button[@type='submit']")
	WebElement btnLogin;
	
	@FindBy(xpath="//img[@src='/src/assets/sidebar-icons/logout.svg']")
	WebElement logout;
	
	@FindBy(xpath="//button[@label='Yes']")
	WebElement yes;

	
	public void setUserName(String uname) 
	{
		txtUserName.sendKeys(uname);
	}
	
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}

	public void clickSubmit() 
	{
		btnLogin.click();
	}
	
	public void clickLogout() 
	{
		logout.clear();
	}
	
	public void clickYes() {
		yes.click();
	}


}
