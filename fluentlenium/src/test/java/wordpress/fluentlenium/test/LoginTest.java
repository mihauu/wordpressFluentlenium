package wordpress.fluentlenium.test;

import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.configuration.FluentConfiguration;
import org.fluentlenium.core.annotation.Page;
import org.junit.Test;

import wordpress.fluentlenium.data.User;
import wordpress.fluentlenium.page.AdminPage;
import wordpress.fluentlenium.page.LoginPage;

public class LoginTest extends WordpressTest {
	@Page
	private LoginPage loginPage;

	@Page
	private AdminPage adminPage;

	@Test
	public void loginTest() {
		goTo(loginPage);
		User user = new User();
		user.setEmail("michal@lkh.pl");
		user.setPassword("OE3SH!AAetEjfD*K");
		loginPage.login(user);
		adminPage.isAt();
	}
}
