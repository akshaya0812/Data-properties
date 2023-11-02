package com.propertiesorangehrm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocatorspro {
	
	@FindBy (name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public WebElement login;

}
