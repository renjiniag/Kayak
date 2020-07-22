package com.kayak.stepdef;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kayak.pages.poHome;
import com.kayak.pages.poSearchPage;
import com.kayak.utilities.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage extends TestBase{
	poHome uhomePage;
	poSearchPage uSearchPage;
	@Given("^Open  browser and enter url$")
	public void open_browser_and_enter_url() throws Throwable {
		startingDependencies();
		uhomePage=new poHome(TestBase.driver);
		uSearchPage=new poSearchPage(TestBase.driver);
	}
	
	@When("^Enter \"([^\"]*)\" and \"([^\"]*)\" Cities$")
	public void enter_and_Cities(String arg1, String arg2) throws Throwable {
		uhomePage.selectOrigin(arg1);		
		uhomePage.selectDestination(arg2);
	}



	@When("^Enter Origin and Destination Cities$")
	public void enter_Origin_and_Destination_Cities() throws Exception {
		/*
		 * uhomePage.selectOrigin();
		 * 
		 * uhomePage.selectDestination();
		 */
		
	}

	@When("^Departure and Return dates are selected$")
	public void departure_and_Return_dates_are_selected() throws Throwable {
	   
	}
	
	@When("^Click Search$")
	public void click_Search() throws Throwable {
		uhomePage.clickSearch();
	}
	
	@Then("^Verify \"([^\"]*)\" and \"([^\"]*)\" Details$")
	public void verify_and_Details(String arg1, String arg2) throws Throwable {
		 uSearchPage.verifyOriginAndDestination(arg1,arg2);
	}

		
	@Then("^Verify Origin and Destination Details$")
	public void verify_Origin_and_Destination_Details() throws Throwable {
	     //  uSearchPage.verifyOriginAndDestination();
	   
	}
	@After
	public void shutdown() {
		tearingDownDependencies();
	}

}
