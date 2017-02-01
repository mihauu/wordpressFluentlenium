package wordpress.fluentlenium.test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import wordpress.fluentlenium.data.User;

public class LoginTest extends WordpressTest {


	@Test
	public void shouldLogin() {
		loginAsAdmin();
		logout();
	}

	@Test
	public void shouldNotLogin() {
		goTo(loginPage);
		User user = new User();
		user.setEmail("nonexisting@lkh.pl");
		user.setPassword("OE3SH!AAetEjfD*K");
		loginPage.login(user);
		loginPage.waitForStopShaking();
		loginPage.isAt();
	}

}
