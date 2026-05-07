package tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest2 extends BaseTest {

	@Test (priority = 1)
	public void logintest() {

		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);

		test.info("Navigating to Login page");
		
		loginpage.navigate();
		
		test.info("Adding the Username and Password and clicking on login button");
		loginpage.loginDetails("Admin", "admin123");
		
		test.info("Clicking on time link");
		//homepage.clickTimeLink();

	}
	
	@Test (priority = 2)
	public void logintest2() 
	{
		test.skip("Test case is skipped");
		throw new SkipException("Skipping this tests");
	}
	
	@Test (priority = 3)
	public void logintest3() {

		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);

		test.info("Navigating to Login page");
		
		loginpage.navigate();
		
		test.info("Adding the Username and Password and clicking on login button");
		loginpage.loginDetails("Admin", "admin123");
		
		test.info("Clicking on time link");
		homepage.clickTimeLink();

	}
}
