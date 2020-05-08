package com.opencart.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.opencart.BaseTest.MainTest;
import com.opencart.pages.HomePage;
import com.opencart.pages.SpecialOfferPage;

public class TestCaseVerifySpecialOfferPage extends MainTest{
	
	WebDriver driver;
	
	
	//Here we get the driver that was set in the MainTest-Class:
	@BeforeClass
	public void setup () throws IOException, InterruptedException {
		
		driver = SetDriver();
	}
	
	@Test (priority=1)
	public void TestSpecialOfferPage () throws InterruptedException {
		
		//SpecialOfferPage SpecialOfferPageObj = new SpecialOfferPage(driver);
		HomePage HomePageObj = new HomePage(driver);
		SpecialOfferPage SpecialOfferPageObj = new SpecialOfferPage(driver);
		
		
		//Navigate to special Offer Page:
		System.out.println("*******Clicking on Special offer link");
		HomePageObj.ClickOnSpecialOfferLink();
		
		//Validations on Special offer page:
		System.out.println("**Calling IsSpecialOfferPageDisplayed() ");
		SpecialOfferPageObj.IsSpecialOfferPageDisplayed();

	}
	
	@Test (priority=2)
	public void CallingMethodFromAnotherTestClass () throws InterruptedException {
		
		SpecialOfferPage SpecialOfferPageObj = new SpecialOfferPage(driver);
		System.out.println("**Calling GetCurrentPageTitle()");
		System.out.println("********CurrentPageTitle="+SpecialOfferPageObj.GetCurrentPageTitle());
		System.out.println("**AGAIN Calling IsSpecialOfferPageDisplayed() ");
		SpecialOfferPageObj.IsSpecialOfferPageDisplayed();
		
		
	}
	
	@AfterClass ()
	public void teardown() {
		
		CloseBrowser();
	}
	
}
