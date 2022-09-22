package com.guru99.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class AlertsPopups extends PageObject {

	
	
	
	@FindBy(xpath="//button[@onclick='jsAlert()']")
	WebElement  jsAlert_button;
	
	
	@FindBy(xpath="//button[@onclick='jsConfirm()']")
	WebElement  Confirmalert_button;
	
	public void JSAlert() throws InterruptedException {
		jsAlert_button.click();
		Thread.sleep(2000);
		getDriver().switchTo().alert().accept();
	}
	
	public void alertwithOK_Cancel() throws InterruptedException {
		Confirmalert_button.click();
		Thread.sleep(2000);
	//	getDriver().switchTo().alert().accept(); // Clicks on OK
		
	getDriver().switchTo().alert().dismiss(); // Clicks on Cancel
		
	}
	
	
}
