package wordpress.fluentlenium.page;

import org.fluentlenium.core.annotation.PageUrl;
import org.openqa.selenium.support.FindBy;

@PageUrl("/wp-admin")
@FindBy(xpath="//h1[contains(text(),'Kokpit')]")
public class AdminPage extends WordpressPage {

}
