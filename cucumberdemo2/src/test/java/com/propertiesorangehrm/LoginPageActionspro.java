package com.propertiesorangehrm;

import org.openqa.selenium.support.PageFactory;



public class LoginPageActionspro {
	
	LoginPageLocatorspro loginPageLocators=null;
	String strUserName,strPassword;
	
	public LoginPageActionspro() {
		this.loginPageLocators=new LoginPageLocatorspro();
		
		PageFactory.initElements(HelperClass.getDriver(),loginPageLocators);
	}
	
	public void setUserName(String strUserName) {
		loginPageLocators.username.sendKeys(strUserName);
	}
	
	public void setPassword(String strPassword) {
		loginPageLocators.password.sendKeys(strPassword);
	}
	
	public void clicklogin() {
		loginPageLocators.login.click();
	}
	
	public void login(String strUserName, String strPassword) {
		setUserName(strUserName);
		setPassword(strPassword);
	}
	

}



