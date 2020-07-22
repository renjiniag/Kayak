package com.kayak.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Jana\\eclipse-workspace\\kayak\\src\\test\\java\\com\\kayak\\featureFiles",
glue= {"com.kayak.stepdef"}, plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		 "junit:target/cucumber-reports/Cucumber.xml",
		 "html:target/cucumber-reports"},
		 monochrome = true)
public class TestRunner {

}
