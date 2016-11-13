package wordpress.fluentlenium.page;

import org.fluentlenium.core.annotation.PageUrl;
import static org.fluentlenium.core.filter.FilterConstructor.*;
@PageUrl("/wp-admin/upload.php")
public class MediaListPage extends WordpressPage {
	public void isAt() {
		$("h1",withText("Biblioteka mediów"));
	}
}
