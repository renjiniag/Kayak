package com.kayak.utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class CommonUtilities {

	Logger log = Logger.getLogger(getClass().getSimpleName());
	static Properties props = new Properties();
	static FileInputStream fileIn = null;
	
	public void loadPropertyFiles(String PropertiesFilePath) throws Exception {

		log.info("Current dir using System:" + PropertiesFilePath);
		fileIn = new FileInputStream(PropertiesFilePath);
		props.load(fileIn);
		System.getProperties().putAll(props);
		
	}
	
	public void loadLog4jProperty(String PropertiesFilePath) throws Exception {
		log.info("Log4j Property file Path :" + PropertiesFilePath);
		fileIn = new FileInputStream(PropertiesFilePath);
		props.load(fileIn);
		PropertyConfigurator.configure(props);
	}
	
}
