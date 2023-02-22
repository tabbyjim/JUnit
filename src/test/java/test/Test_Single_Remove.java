package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.Remove_Single_Checkbox;
import util.BrowserFactory;

public class Test_Single_Remove {

	WebDriver driver;
	
	@Test
	public void ValidateSingleCheckboxRemove() {
		
		driver = BrowserFactory.init();

		Remove_Single_Checkbox removeSingleCheckbox= PageFactory.initElements(driver, Remove_Single_Checkbox.class);
	
		removeSingleCheckbox.ClickOnSelectCheckbox();
		removeSingleCheckbox.ClickOnRemoveButton();
		
		boolean generalBoxDeleted = removeSingleCheckbox.isListItemRemoved();

	    if(generalBoxDeleted=true){
	    	System.out.println("Item remove successfully");
	    }else{
	       System.out.println("unable to remove the item");
	    }
	    driver = BrowserFactory.tearDown();
	}
}
