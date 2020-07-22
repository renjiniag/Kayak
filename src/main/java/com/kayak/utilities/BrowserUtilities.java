package com.kayak.utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtilities {
	Logger log = Logger.getLogger(getClass().getSimpleName());
	
	public  void launchBroswer(String browser,String url) {
		if(browser.startsWith("ch")) {
			WebDriverManager.chromedriver().setup();
			TestBase.driver=new ChromeDriver();
			log.info("Launching Chrome Browser");
		}
		else if(browser.startsWith("ed")) {
			WebDriverManager.edgedriver().setup();
			TestBase.driver=new EdgeDriver();
			log.info("Launching Edge Browser");
		}
		else {

			log.info("Wrong Browser");
		}
		if(TestBase.driver!=null) {
			TestBase.driver.get(url);
			log.info("Launching URL");
			TestBase.driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			TestBase.driver.manage().window().maximize();
		}
	}
	
	public void quitBrowser() {
		log.info("Closing Browser");
		TestBase.driver.quit();
	}
	//Getting WebElement Text
	public String getTextValue(WebElement arg0) {
		if(arg0.isDisplayed()==true) {
			log.info( arg0.getText()+" Displayed");
			return arg0.getText();
		}
		else {
			log.info(arg0.getText()+"Not Displayed");
			return null;
		}
	}
	//SendKeys to WebElement
	public void sentText(WebElement textBox,String input,String textbox_name) {
		if(textBox.isDisplayed()==true) {
			if(textBox.isEnabled()==true) {
				textBox.clear();
				textBox.sendKeys(input);
				if(textBox.getAttribute("value").equals(input)) {
					log.info(input+" "+textbox_name );
				}
				else {
					log.info(input+" "+textbox_name);
				}
			}
			else
				log.info(textbox_name+" not enabled");
		}
		else
			log.info(textbox_name+" not displayed");
	}
	
//Click WebElement
	public void clickButton(WebElement button,String buttonName) {
		if(button.isDisplayed()==true) {
			if(button.isEnabled()==true) {
				button.click();
				log.info( buttonName+" clicked");
			}
			else {
				log.info(buttonName+" not enabled" );
			}
		}
		else {
			log.info(buttonName+" not displayed" );
		}
	}
	
	//Wait for element to be displayed 
	@SuppressWarnings("deprecation")
	public boolean waitForElementVisible(WebDriver driver, final WebElement ele, int iTimeInSeconds) throws Exception {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(iTimeInSeconds, TimeUnit.SECONDS)
				.pollingEvery(500, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);

		wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if (ele.isDisplayed()) {
					log.info("Element Displayed : " + ele);
					return ele;
				} else {
					log.info("******Element NOT Displayed : " + ele);
					return null;
				}
			}
		});

		return ele.isDisplayed();
	}
	
	//Wait for element to be disabled
	public boolean waitForElementDisable(WebDriver driver, final WebElement ele, int iTimeInSeconds) {

		@SuppressWarnings("deprecation")
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(iTimeInSeconds, TimeUnit.SECONDS)
				.pollingEvery(50, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);

		wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if (!ele.isDisplayed()) {
					log.info("Element Not Displayed : " + ele);
					return ele;
				} else {
					log.info("******Element is Still Displaying : " + ele);
					return null;
				}
			}
		});

		return !ele.isDisplayed();
	}
	
	//Check for element displayed
	public boolean isDisplayed(WebElement ele) throws Exception {
		boolean bRes_flag = false;
		try {
			if (ele.isDisplayed()) {
				log.info("Displayed " + ele);
				bRes_flag = true;
			}
		} catch (Exception ea) {
			bRes_flag = false;
		}
		return bRes_flag;
	}
	
	//take screenshot 
	public void screenShotBrowser(WebDriver driver, String className) throws Exception {
		String destDir = "screenshots";
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		String destFile = className + ".png";

		try {
			FileUtils.copyFile(scrFile,
					new File(System.getProperty("user.dir") + "/test-output/" + destDir + "/" + destFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Scroll intoView
	public boolean ScrollToView(WebDriver driver, WebElement ele) throws Exception {
		boolean bRes_Flag = false;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		bRes_Flag = true;
		return bRes_Flag;
	}

	
	
	//clear
	public static void clear (WebElement ele)
	{
		ele.clear();
	}
	

}
