package com.guru99.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class LoginPage  extends PageObject{
	
	
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement Username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	

	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement Login;
	
	
	
	
	public void EnterUserName()
	{ 
              
		Username.sendKeys("mngr266311");
	}
	
	
	public void EnterPassword()
	{ 
              
		Password.sendKeys("YvuzYtY");
	}
	
	public void Login() {
		Login.click();
	}

}
