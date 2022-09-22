package com.guru99.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class DragandDrop  extends PageObject{
	
	
	
	@FindBy(xpath="//a[normalize-space()='BANK']")
	WebElement  drag1;
	
	@FindBy(xpath="//section[@id='g-container-main']//li[2]//a[1]")
	WebElement  drag2;
	
	
	
	@FindBy(xpath="//ol[@id='bank']//li[@class='placeholder']")
	WebElement  drop1;
	
	@FindBy(xpath="//ol[@id='amt7']//li[@class='placeholder']")
	WebElement  drop2;
	
	
	public void dragdrop() 
	{
		Actions actions = new Actions(getDriver());
		
		actions.dragAndDrop(drag1, drop1).perform();
		actions.dragAndDrop(drag2, drop2).perform();
		
	
		
	}
	
}
