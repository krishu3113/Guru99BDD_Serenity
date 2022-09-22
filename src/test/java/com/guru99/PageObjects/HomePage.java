package com.guru99.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;

public class HomePage  extends PageObject{
	
	
	
	
	
//	@FindBy(xpath="//a[@class='dropdown-toggle'][normalize-space()='Selenium']")
	//WebElement dropdown;
	
	
	
	public void click_dropdown() {
		
	//	dropdown.click();
		
//	Select drpdwn=new Select(dropdown)
//	drpdwn.selectByVisibleText("Drag and Drop Action");
//	
		
		 WebElement option_dropdown=getDriver().findElement(By.xpath("//a[normalize-space()='Selenium']//b[@class='caret']"));
	       // option_dropdown.click();
	        
	     Select drpdwn=new Select(getDriver().findElement(By.xpath("//li[@class='dropdown open']//ul[@class='dropdown-menu']")));
	       
	  List<WebElement> alloptions=drpdwn.getOptions();
	  
	  for(WebElement option:alloptions) 
	  {
		  if(option.getText().equals("Drag and Drop Action"))
		  {
			  option.click();
			  break;
			  
		  }
		  
		  
		  
	  }
	        
	        
	      
	        
	      
		}

}
