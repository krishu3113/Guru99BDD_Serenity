package com.guru99.StepDefinition;

import java.awt.AWTException;

import com.guru99.PageObjects.AlertsPopups;
import com.guru99.PageObjects.CheckboxRadiobuttons;
import com.guru99.PageObjects.DragandDrop;
import com.guru99.PageObjects.Fileupload;
import com.guru99.PageObjects.HomePage;
import com.guru99.PageObjects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class StepDef  extends PageObject{
	
	
	@Steps
	LoginPage lp;
	HomePage hp;
	CheckboxRadiobuttons radiocheckboxx;
	DragandDrop dragdrop;
	Fileupload fileupload;
	AlertsPopups alertpopup;

	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		
		 getDriver().manage().window().maximize();
		 getDriver().get("https://demo.guru99.com/v4/index.php");

	}
	@When("user enters username and password")
	public void user_enters_username_and_password() {
		
		lp.EnterUserName();
		lp.EnterPassword();
	    
	}
	@When("clicks on sign-in button")
	public void clicks_on_sign_in_button() {
		lp.Login();
	    
	}
	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
		
		
		System.out.println("User is on HomePage1:");
	   
	}
	
	
	
	@Given("User is on Radio and checkbox buttons page")
	public void user_is_on_radio_and_checkbox_buttons_page() 
	{
		
		 getDriver().manage().window().maximize();
		 getDriver().get("http://demo.guru99.com/test/radio.html");    
	    
	}
	@When("use clicks  radio button")
	public void use_clicks_radio_button() {
		
		radiocheckboxx.radiobutton();
		System.out.println("Radiobutton 1 is selected:");
		radiocheckboxx.radiobutton_next();
		System.out.println("Radiobutton 1 is Deselected and Radio botton3 is selected:");

		
		
	   
	}
	@When("user clicks on checkbox")
	public void user_clicks_on_checkbox() {
		radiocheckboxx.checkboxes();
	    
	}
	@Then("User  should able to perform actions")
	public void user_should_able_to_perform_actions() {
	   
	}
	
	
	
	@Given("user is on Drag and drop page")
	public void user_is_on_drag_and_drop_page()
	{
		 getDriver().manage().window().maximize();
		 getDriver().get("https://demo.guru99.com/test/drag_drop.html"); 
		
	}
	@Then("user performs drag and drop action")
	public void user_performs_drag_and_drop_action() 
	{
		dragdrop.dragdrop();
		
	}


	@Given("User is on file upload page")
	public void user_is_on_file_upload_page() {
		 getDriver().manage().window().maximize();
		 getDriver().get("https://demo.guru99.com/test/upload/"); 
		
	}
	@When("user performs file upload action")
	public void user_performs_file_upload_action() throws AWTException {
	    
		fileupload.File_Uploading();
		
		fileupload.Submit_File();
	}
	@Then("File Uploading should be successfully completed")
	public void file_uploading_should_be_successfully_completed() {
	   
		//waitABit(2000);
		System.out.println("File is Uploaded Successfully");
	}
	
	
	
	@Given("User is on Alets Page tab")
	public void user_is_on_alets_page_tab() {
		 getDriver().manage().window().maximize();
		 getDriver().get("https://the-internet.herokuapp.com/javascript_alerts"); 
		
	   
	}
	@When("User Performs actions")
	public void user_performs_actions() throws InterruptedException {
		alertpopup.JSAlert();
		alertpopup.alertwithOK_Cancel();
		
		
	}
	@Then("alerts and popups should be handled succesfully")
	public void alerts_and_popups_should_be_handled_succesfully() {
	    
	}




}
