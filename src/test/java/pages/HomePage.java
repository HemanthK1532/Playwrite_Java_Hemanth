package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class HomePage {

	private Page page;
	private Locator timeLink;

	public HomePage(Page page) {
		this.page = page;

		// ✅ Proper locator initialization
		this.timeLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Timess"));
	}

	public void clickTimeLink() {
		timeLink.click();
	}
}