package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpecialOfferPage {
	
	WebDriver driver;
    
    By SpecialOffer = By.linkText("Special Offers");
    
    //Constructor is defined here with this.---keyword that makes the driver-parameter stick 
    //to the one defined in the class here above -- WebDriver driver.
    public SpecialOfferPage(WebDriver driver){
        this.driver = driver;
    }
    
    //Check if the Special Offers Page is displayed:
    public void IsSpecialOfferPageDisplayed() throws InterruptedException{
        
    	if (driver.findElement(SpecialOffer).isDisplayed() == true ) {
    	
    		System.out.println("****SpecialOffer is displayed = " + SpecialOffer);
    		System.out.println(driver.findElement(SpecialOffer).getText());
    	}
    
    }
    
    public String GetCurrentPageTitle() {
    	
    	return driver.getTitle();
    }
    
}
