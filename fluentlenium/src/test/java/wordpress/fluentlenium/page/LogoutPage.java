package wordpress.fluentlenium.page;

import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

@PageUrl("/wp-login.php?loggedout=true")
public class LogoutPage extends LoginPage {

	@FindBy(id = "wp-admin-bar-my-account")
	private FluentWebElement myaAccount;

	@FindBy(id = "wp-admin-bar-logout")
	private FluentWebElement logoutLink;

	@FindBy(id = "wp-admin-bar-top-secondary")
	private FluentWebElement wpAdmin;

	@Override
	public String getUrl() {
		if (wpAdmin.present()) {
			myaAccount.mouse().moveToElement();
			await().until(logoutLink).displayed();
			logoutLink.click();
		}
		return "";
	}
}
