package com.kayak.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kayak.utilities.TestBase;

public class poHome extends TestBase{
	
	public poHome(WebDriver driver) {
		TestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[contains(@id,'origin')]//button[contains(@class,'js-remove-selection')]")
	WebElement clearOrigin;
	@FindBy(xpath="//input[contains(@id,'origin-airport') and contains(@name,'origin')][1]")
	WebElement originBox;
	@FindBy(xpath="//div[contains(@id,'origin-airport-smartbox-dropdown')]/ul/li[1]")
	WebElement originDropDownElement;
	@FindBy(xpath="//div[contains(@id,'destination-airport-display-inner')][1]")
	WebElement destination;
	@FindBy(xpath="//input[contains(@id,'destination-airport') and contains(@name,'destination')][1]")
	WebElement destinationBox;
	@FindBy(xpath="//div[contains(@id,'destination-airport-smartbox-dropdown')]/ul/li[1]")
	WebElement destinationDropDownElement;
	@FindBy(xpath="//button[contains(@id,'submit')][1]")
	WebElement search;
	@FindBy(xpath="//button[contains(@id,'covid-loading-dialog-close')]")
	WebElement closecovid;
	
	
	public void selectOrigin(String arg1) throws Exception {
		browserUtil.clickButton(clearOrigin, "Clear Origin");
		browserUtil.sentText(originBox, arg1, "Origin");
		browserUtil.clickButton(originBox,"Origin");
		browserUtil.waitForElementVisible(driver, originDropDownElement, 5);
		browserUtil.clickButton(originDropDownElement,"Origin Dropdown");
	}
	public void selectDestination(String arg2) throws Exception {
		browserUtil.clickButton(destination,"Destiation");
		browserUtil.sentText(destinationBox,arg2,"Destination");
		browserUtil.clickButton(destinationBox,"Destination");
		browserUtil.waitForElementVisible(driver, destinationDropDownElement, 5);
		browserUtil.clickButton(destinationDropDownElement,"Destination dropdown");
	}
	public void clickSearch() throws Exception {
		browserUtil.clickButton(search,"Search");
		browserUtil.waitForElementVisible(driver, closecovid, 5);
		browserUtil.clickButton(closecovid,"Covid");
	}

}
