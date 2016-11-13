package wordpress.fluentlenium.test;


import static org.assertj.core.api.Assertions.*;
import org.fluentlenium.core.annotation.Page;
import org.junit.Test;

import wordpress.fluentlenium.data.FileMedia;
import wordpress.fluentlenium.page.MediaAddNew;
import wordpress.fluentlenium.page.MediaListPage;

public class MediaTest extends WordpressTest {

	@Page
	private MediaListPage mediaListPage;

	@Page
	private MediaAddNew mediaAddNew;

	@Test
	public void shouldAddJpg() {
		loginAsAdmin();
		goTo(mediaAddNew);
		mediaAddNew.isAt();
		mediaAddNew.switchToClassicUpload();
		
		FileMedia file = new FileMedia();
		file.setName("IMG_20160908_075726.jpg");
		file.setDir(System.getProperty("user.dir") + "/upload");

		mediaAddNew.upload(file);
		mediaListPage.isAt();
		mediaListPage.search(file);
		mediaListPage.isAt();
		assertThat(mediaListPage.isFile(1, file)).as("File didn't upload corectly. " + file.getName()).isTrue();
	}
}
