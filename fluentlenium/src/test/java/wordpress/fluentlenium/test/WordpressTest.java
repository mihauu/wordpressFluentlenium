package wordpress.fluentlenium.test;

import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.configuration.FluentConfiguration;

@FluentConfiguration(webDriver = "chrome", baseUrl = "http://wordpress.mihauu.kei.pl")
public class WordpressTest extends FluentTest {
	public WordpressTest() {

	}
}
