package wordpress.fluentlenium.page;

import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import wordpress.fluentlenium.data.FileMedia;

@PageUrl("/wp-admin/media-new.php")
@FindBy(id = "file-form")
public class MediaAddNew extends WordpressPage {
	@FindBy(id = "upload-flash-bypass")
	private FluentWebElement uploadByFlash;

	@FindBy(id="async-upload")
	private FluentWebElement fileInput;
	
	@FindBy(id="html-upload")
	private FluentWebElement submitButton;
	
	public void switchToClassicUpload() {
		if(uploadByFlash.present())
			uploadByFlash.$("a").click();
		
	}

	public void upload(FileMedia file) {
		fileInput.fill().with(file.getPath());
		submitButton.click();
	}
	
	

}
