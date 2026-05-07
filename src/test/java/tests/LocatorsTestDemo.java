package tests;

import org.testng.annotations.Test;

import base.BaseTest;

public class LocatorsTestDemo extends BaseTest {
	
	@Test
	public void testAllLocators()
	{
		page.navigate("https://trytestingthis.netlify.app/");
		
		//using ID attribute
		page.locator("#fname").fill("Heman");
		//using name attribute
		page.locator("input[name = 'lname']").fill("Rock");
		
		//select the radio button using value, type and index
		page.locator("input[value = 'male']").check();
		//using index
		page.locator("input[type = 'radio']").nth(1).check();
		
		//selecting Dropdown using ID
		
		page.locator("select#option").selectOption("option 3");
		page.locator("#option").selectOption("option 2");
		
		
		
		
		//it pause the execution
		page.pause();
	}

}
