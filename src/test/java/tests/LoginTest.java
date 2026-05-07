package tests;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;


public class LoginTest extends BaseTest {
	
	@Test
	public void test()
	{
      page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).click();
      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("Admin");
      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).press("Tab");
      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("admin123");
      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).press("Tab");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
      assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("client brand banner"))).isVisible();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Time")).click();
      assertThat(page.getByRole(AriaRole.BANNER)).containsText("TimeTimesheets");
  }
}
