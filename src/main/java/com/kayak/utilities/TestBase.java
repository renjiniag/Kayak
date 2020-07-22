package com.kayak.utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class TestBase {
	public static WebDriver driver;
	public Logger log;
	public static BrowserUtilities browserUtil=new BrowserUtilities();
	public static CommonUtilities comUtil= new CommonUtilities();
	
	

	public void startingDependencies() throws Exception {
		comUtil.loadPropertyFiles(System.getProperty("user.dir") +"/src/main/java/com/kayak/properties/config.properties");
		comUtil.loadLog4jProperty(System.getProperty("user.dir") +"/src/main/java/com/kayak/properties/log4j.properties");
		comUtil.loadPropertyFiles(System.getProperty("user.dir") +"/resources/testData/testData.properties");
		browserUtil.launchBroswer(System.getProperty("Browser"),System.getProperty("url"));
		
	}
	

	public void tearingDownDependencies() {
		browserUtil.quitBrowser();
	}
}
