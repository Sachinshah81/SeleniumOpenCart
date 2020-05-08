package com.opencart.test;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.BaseTest.MainTest;
import com.opencart.pages.HomePage;

import junit.framework.Assert;

public class VerifyHomePageTestOne extends MainTest {

	WebDriver driver;

	//Here we get the driver that was set in the MainTest-Class:
	@BeforeClass
	public void setup () throws IOException, InterruptedException {
		
		driver = SetDriver();
	}
	
	@Test (priority=0)
	public void TestHomePage () throws InterruptedException {
		
		Thread.sleep(1000);
		HomePage ObjHomePage = new HomePage(driver);
		
		System.out.println("**Calling CheckIfHomePageTitleIsCorrect()");
		ObjHomePage.CheckIfHomePageTitleIsCorrect();
		
		System.out.println("**Calling CheckIfCurrencyBlockIsPresent()");
		ObjHomePage.CheckIfCurrencyBlockIsPresent();
	}
	
	
	@AfterClass
	public void teardown() {
		
		driver.quit();
		System.out.println("****************Called TearDown() method");
	}
	
}
