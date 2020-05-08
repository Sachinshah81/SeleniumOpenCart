package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

//This class will have all methods pertaining to actions on the home page:
public class HomePage {
		
	WebDriver driver;
    
    By CurrencyBlock 	= By.xpath("//*[@id=\"form-currency\"]/div/button/span");
    By SpecialOffer 	= By.linkText("Specials"); 
    
    //Constructor is defined here with "this.driver" keyword makes the driver-parameter stick 
    //to the one defined in the class here above -- WebDriver driver.
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    
    //Check if HomePage title is correct:
    public void CheckIfHomePageTitleIsCorrect() {
    	
		String HomePageTile = driver.getTitle();
		System.out.println("***Home Page title=" + HomePageTile);
		
		//We get the page title and assert it's presence
		Assert.assertEquals("****Home page title is incorrect !!!!", "Your Store", HomePageTile);
    	
    }
    
    
    //Check if Currency block is present:
    public void CheckIfCurrencyBlockIsPresent(){
        
    	if (driver.findElement(CurrencyBlock).isDisplayed() == true ) {
    	
    		System.out.println("****CurrencyBlock is displayed = " + CurrencyBlock);
    	}
    }
    	
    //Click on Special Offer link at bottom of Home Page:
    public void ClickOnSpecialOfferLink () {
    	
    	driver.findElement(SpecialOffer).click();
    }
    

}
