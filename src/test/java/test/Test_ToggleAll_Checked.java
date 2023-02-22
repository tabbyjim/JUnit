package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.ToggleAll_Checked;
import util.BrowserFactory;

public class Test_ToggleAll_Checked {

	WebDriver driver;
	
	@Test
	public void ValidateToggleAllChecked() {
		driver = BrowserFactory.init();
		
		ToggleAll_Checked toggleAllChecked = PageFactory.initElements(driver, ToggleAll_Checked.class);

		toggleAllChecked.clickOnToggleAll();
		toggleAllChecked.validateAllBoxAreChecked();
		
		driver = BrowserFactory.tearDown();
	}
	
}
