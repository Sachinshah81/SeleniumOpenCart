package com.opencart.BaseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainTest {
	
	WebDriver driver;
	
	public WebDriver SetDriver() throws IOException, InterruptedException {
		
		//Create a new object of class-type "Properties"
		Properties MydatafileObject = new Properties();
		//Create a new object to handle the properties file with the given path of that file
		//FileInputStream MypropertiesFile = new FileInputStream ("C:\\Users\\sachisha\\eclipse-workspace\\OpenCartAutomation\\InputDataSetFile.properties");
		FileInputStream MypropertiesFile = new FileInputStream ("C:\\Users\\sachisha\\git\\Opencart\\OpenCartAutomation\\InputDataSetFile.properties");
		//Connect the two objects loading the properties file
		MydatafileObject.load(MypropertiesFile);
		
		if (MydatafileObject.getProperty("browser").equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", MydatafileObject.getProperty("driverpath"));
			driver = new ChromeDriver();
		}
		else 
			if (MydatafileObject.getProperty("browser").equalsIgnoreCase("firefox")){
				driver = new FirefoxDriver();
			}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Now we can access the values/data using key-value method: 
		System.out.println("************Launching CHROME Browser");
		System.out.println("****Entering URL from input file="+ MydatafileObject.getProperty("url"));
		//Opening URL
		driver.get(MydatafileObject.getProperty("url"));
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public void CloseBrowser() {
		driver.quit();
	}

}
