package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.Remove_All_Checkbox;
import util.BrowserFactory;

public class Test_Remove_All {

WebDriver driver;
	
	@Test
	public void ValidateAllItemRemove() {
		driver = BrowserFactory.init();
		
		Remove_All_Checkbox removeAllCheckbox = PageFactory.initElements(driver, Remove_All_Checkbox.class);

		removeAllCheckbox.clickOnToggleAllButton();;
		removeAllCheckbox.clickOnRemoveButton();;
		
		driver = BrowserFactory.tearDown();
	}
	
}
