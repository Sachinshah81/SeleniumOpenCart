package com.opencart.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.opencart.Common.CommonLibFunction;

public class TestCommonUtilityFunctions {
	
	@Test
	public void TestCommon() {
		
		CommonLibFunction ObjCommonLibFunction = new CommonLibFunction();
		System.out.println("Value of StringStartsWith=" + ObjCommonLibFunction.StringStartsWith("ABCDE", "A"));
		
		ArrayList<String> MyList = new ArrayList<String>();
		MyList.add("Ronaldo");
		MyList.add("Messi");
		MyList.add("Iniesta");
		
		System.out.println("Value of ObjCommonLibFunction.ListValueIndexMatch= "+ObjCommonLibFunction.DoesListContainValue(MyList, "Ronaldo"));
		System.out.println("Value of ObjCommonLibFunction.ListValueIndexMatch= "+ObjCommonLibFunction.DoesListContainValue(MyList, "Ronaldoo"));
	}

	
	
}
