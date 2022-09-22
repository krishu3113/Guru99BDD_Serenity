package com.guru99.PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class Fileupload extends PageObject {
	
	
	@FindBy(xpath="//input[@type='file']")
	WebElement  fileupload_button;
	
	
	@FindBy(xpath="//button[@id='submitbutton']")
	WebElement  SubmitFile_button;
	
	
	public void File_Uploading() throws AWTException {
		//fileupload_button.sendKeys("C:\\Users\\KRISPATI\\OneDrive - Capgemini\\Desktop\\Resume.txt");
		
		//fileupload_button.click();
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();  
		js.executeScript("arguments[0].click();",fileupload_button);
		
		
		Robot rb=new Robot();
		rb.delay(1000);
		
		StringSelection stringSelection = new StringSelection("C:\\Users\\KRISPATI\\OneDrive - Capgemini\\Desktop\\Resume.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		System.out.println("Selected the path of file");
		
		
		rb.keyPress(KeyEvent.VK_CONTROL); // Press on contol key from keyboard
		rb.keyPress(KeyEvent.VK_V);
		System.out.println("File Pasted Successfully");
		rb.delay(1000);

		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_CONTROL); // Realase key
		rb.delay(1000);

		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("File is opened and entered");
	}

	
	public void Submit_File() {
		SubmitFile_button.click();
	}
}
