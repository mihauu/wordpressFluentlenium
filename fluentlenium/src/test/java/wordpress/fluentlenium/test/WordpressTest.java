package wordpress.fluentlenium.test;

import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.configuration.ConfigurationProperties;
import org.fluentlenium.configuration.FluentConfiguration;
import org.fluentlenium.core.annotation.Page;

import wordpress.fluentlenium.data.User;
import wordpress.fluentlenium.page.AdminPage;
import wordpress.fluentlenium.page.LoginPage;
import wordpress.fluentlenium.page.LogoutPage;

@FluentConfiguration(webDriver = "chrome", baseUrl = "http://wordpress.mihauu.kei.pl", driverLifecycle = ConfigurationProperties.DriverLifecycle.JVM)
public class WordpressTest extends FluentTest {
	@Page
	protected LoginPage loginPage;

	@Page
	protected AdminPage adminPage;

	@Page
	protected LogoutPage logoutPage;

	/**
	 * constructor only for not showing error
	 */
	public WordpressTest() {

	}

	protected void loginAsAdmin() {
		goTo(loginPage);
		User user = new User();
		user.setEmail("michal@lkh.pl");
		user.setPassword("OE3SH!AAetEjfD*K");
		loginPage.login(user);
		adminPage.isAt();
	}

}
