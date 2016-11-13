package wordpress.fluentlenium.page;

import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import wordpress.fluentlenium.data.FileMedia;
import static org.fluentlenium.core.filter.FilterConstructor.*;

@PageUrl("/wp-admin/upload.php")
public class MediaListPage extends WordpressPage {
	@FindBy(id = "media-search-input")
	private FluentWebElement search;

	@FindBy(id = "the-list")
	private FluentWebElement list;

	public void isAt() {
		$("h1", withText("Biblioteka mediów"));
	}

	public void search(FileMedia file) {
		search.fill().with(file.getShortName());
		keyboard().basic().pressKey(Keys.ENTER);
	}

	public boolean isFile(int rowNumber, FileMedia file) {
		FluentWebElement element = list.$("tr").index(rowNumber).$(".filename").first();
		return element.text().contains(file.getShortName());
	}
}
