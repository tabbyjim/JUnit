package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Remove_All_Checkbox {

	 WebDriver driver;
		
		public Remove_All_Checkbox(WebDriver driver) {
			this.driver = driver;
		}
		
		@FindBy(how= How.CSS , using="input[name='allbox']")WebElement ToggleAll_Button;
		@FindBy(how=How.CSS ,using="input[type='submit'][value='Remove']")WebElement Remove_Button;

		public void clickOnToggleAllButton() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ToggleAll_Button.click();
		}
		public void clickOnRemoveButton() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Remove_Button.click();
		}
}
