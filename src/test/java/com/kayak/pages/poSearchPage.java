package com.kayak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.kayak.utilities.TestBase;

public class poSearchPage extends TestBase{

	public poSearchPage(WebDriver driver) {
		TestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[contains(@id,'origin-airport-display')]//div[contains(@class,'js-selection-value')]")
	WebElement uOrigin;
	@FindBy(xpath="//div[contains(@id,'destination-airport-display')]//div[contains(@class,'js-selection-value')]")
	WebElement uDestination;
	
	public void verifyOriginAndDestination(String arg1,String arg2) throws Exception {
		//WebDriverWait wait=new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOf(uOrigin));
		Assert.assertTrue(uOrigin.getAttribute("textContent").contains(arg1),"Origin");
		Assert.assertTrue(uDestination.getAttribute("textContent").contains(arg2),"Destination");
	}
}
