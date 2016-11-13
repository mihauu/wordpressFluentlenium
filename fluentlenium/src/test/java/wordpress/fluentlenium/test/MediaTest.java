package wordpress.fluentlenium.test;

import org.fluentlenium.core.annotation.Page;
import org.junit.Test;

import wordpress.fluentlenium.page.MediaListPage;

public class MediaTest extends WordpressTest {
	
	@Page
	private MediaListPage mediaListPage; 
	
	@Test
	public void shouldAddJpg() {
		loginAsAdmin();
		
	}
}
