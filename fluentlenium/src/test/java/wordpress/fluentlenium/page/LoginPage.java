package wordpress.fluentlenium.page;


import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import wordpress.fluentlenium.data.User;

@PageUrl("/wp-login.php")
@FindBy(id = "loginform")
public class LoginPage extends WordpressPage {
	private FluentWebElement user_login;
	private FluentWebElement user_pass;
	@FindBy(id = "wp-submit")
	private FluentWebElement user_submit;

	public void login(User user) {
		user_login.fill().with(user.getEmail());
		user_pass.fill().with(user.getPassword());
		user_submit.click();
	}
}
