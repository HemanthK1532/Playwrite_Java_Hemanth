package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LoginPage {
	private Page page;

	// Locators
	// private final String usernameTextBox = "getByRole(AriaRole.TEXTBOX, new
	// Page.GetByRoleOptions().setName(\"Username\"))";
	// private final String passwordTextBox = "getByRole(AriaRole.TEXTBOX, new
	// Page.GetByRoleOptions().setName(\"Password\"))";
	// private final String loginButton= "getByRole(AriaRole.BUTTON, new
	// Page.GetByRoleOptions().setName(\"Login\"))";

	private Locator usernameTextBox;
	private Locator passwordTextBox;
	private Locator loginButton;

	// constructor -
	// 1.same as class name
	// 2.doesn't have return type
	// 3.it is called the moment LoginPage object is created
	public LoginPage(Page page) {
		this.page = page;

		this.usernameTextBox = page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username"));

		this.passwordTextBox = page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password"));

		this.loginButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login"));
		
		
	}

//	public void addUsername(String username)
//	{
//		page.fill(usernameTextBox, username);
//	}
//	public void addPassword(String password)
//	{
//		page.fill(passwordTextBox, password);
//	}
//	
//	public void clickLoginButton()
//	{
//		page.click(loginButton);
//	}

	// Page actions
	public void navigate() {
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	public void loginDetails(String username, String password) {
		usernameTextBox.fill(username);
		passwordTextBox.fill(password);
		loginButton.click();
	}

}
