package com.opencart.Common;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonLibFunction {
	
	/*
	 *      Create methods to check:
     i. String starts with
     ii. String ends with
     iii. String contains with
     iv. String equals with
     v. String alphanumeric
     vi. String contains only alphabets
     vii. String contains only numbers
     viii. String contains uppercase character
     ix. String contains special character
     x. List contains a specific value
     xi. Index of a specific value in a list
     xii. Compare two List<List<String>> and find out the
            cells contains different values
     xiii. Random string generation
	 * 
	 */
	
	
	
	/*
	WebDriver driver;
	
	public CommonLibFunction(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		
	}*/
	
	//String starts with:
	public Boolean StringStartsWith (String InputString, String StartsWithString) {
		
		return InputString.startsWith(StartsWithString);
	}
	
	//String Ends with:
	public Boolean StringEndsWith (String InputString, String EndsWithString) {
		
		return InputString.endsWith(EndsWithString);
	}
	
	//String contains with:
	public Boolean StringContainsWith (String InputString, String ContainsWithString) {
		
		return InputString.contains(ContainsWithString);
	}	
	
	//String equals with:
	public Boolean StringEqualsWith (String InputString, String EqualsWithString) {
		
		return InputString.contains(EqualsWithString);
	}		
	
	//Is String alphanumeric:
	public Boolean IsStringAlphaNumeric (String InputString) {
		
		return StringUtils.isAlphanumeric(InputString);
	}	

	//Is String Only Aplhabet:
	public Boolean IsStringOnlyAlphabet (String InputString) {
		
		return StringUtils.isAlpha(InputString);
	}	
	
	//Is String Only Numeric:
	public Boolean IsStringOnlyNumeric (String InputString) {
		
		return StringUtils.isNumeric(InputString);
	}	
		
	//Is String contains uppercase character
	public Boolean IsStringContainsUpperCaseChar (String InputString) {
		
		char currentchar;
		boolean UpperCaseFlag = false;
		//Test each character if it's uppercase
		for (int i=0 ; i<InputString.length(); i++) {
			
			currentchar =  InputString.charAt(i);
			if (Character.isUpperCase(currentchar)) {
				
				UpperCaseFlag = true;
			}
		}//for-loop
		
		return UpperCaseFlag;
	}	
	
	//Is String contains Special char:
	public Boolean IsStringContainsSpecialChar (String InputString) {
		
		Pattern patternstring = Pattern.compile("[a-zA-Z0-9]*", Pattern.CASE_INSENSITIVE);
		Matcher match = patternstring.matcher(InputString);
				
		return match.find();
		
	}
	
	//Does List contain a specific value:
	public Boolean DoesListContainValue(ArrayList<String> list, String Value) {
		
		return list.contains(Value);
	}
	
	//Index of a specific value in a list:
	/*public String ListValueIndexMatch(ArrayList<String> list, String ItemToMatch) {
		
		for (int i=0; i<list.size(); i++) {
			
			if (list.get(i) == ItemToMatch) {
				int indexValue = i;
				break;
			}
		
		return indexValue;
	}
	*/
	
}
