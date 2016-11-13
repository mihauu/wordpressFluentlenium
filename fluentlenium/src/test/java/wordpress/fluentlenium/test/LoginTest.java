package wordpress.fluentlenium.test;

import org.junit.Before;
import org.junit.Test;

import wordpress.fluentlenium.data.User;

public class LoginTest extends WordpressTest {

	@Before
	public void prepare() {
		goTo(logoutPage);
	}

	@Test
	public void shouldLogin() {
		loginAsAdmin();
	}


	@Test
	public void shouldnotLogin() {
		goTo(loginPage);
		User user = new User();
		user.setEmail("nonexisting@lkh.pl");
		user.setPassword("OE3SH!AAetEjfD*K");
		loginPage.login(user);
		loginPage.isAt();
	}

}
