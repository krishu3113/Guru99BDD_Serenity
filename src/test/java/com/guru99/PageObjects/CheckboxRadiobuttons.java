package com.guru99.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class CheckboxRadiobuttons extends PageObject {
	
	
	@FindBy(xpath="//input[@id='vfb-7-1']")
	WebElement  radio1;
	
	@FindBy(xpath="//input[@id='vfb-7-3']")
	WebElement  radio3;
	
	
	
	
	public void radiobutton() {
		radio1.click();
		
	}
	
	public void radiobutton_next() {
		radio3.click();
		
	}
	
	
	public void checkboxes() {
		
		List<WebElement> checkbox_list =getDriver().findElements(By.xpath("//input[@type='checkbox']"));
		
//		for(int i=0; i<checkbox_list.size();i++) 
//		{
//			checkbox_list.get(i).click();
//			
//			
//		}
		
		for( WebElement chbox:checkbox_list) 
		{
			//chbox.click();
			
			
		String checkboxname = chbox.getAttribute("value");
		if(checkboxname.equals("checkbox1") || checkboxname.equals("checkbox3") )
		{
			chbox.click();
		}
			
		}
		
	}

	
	
	
	
}
