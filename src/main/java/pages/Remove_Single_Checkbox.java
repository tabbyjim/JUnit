package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Remove_Single_Checkbox {

	 WebDriver driver;
		
		public Remove_Single_Checkbox(WebDriver driver) {
			this.driver = driver;
		}
		
		@FindBy(how = How.CSS, using="input[type='checkbox'][name='todo[6]']")WebElement Select_Checkbox;
		@FindBy(how=How.CSS ,using="input[type='submit'][value='Remove']")WebElement Remove_Button;
		@FindBy(how=How.XPATH ,using="//*[@id=\"todos-content\"]/form/ul/li[6]")WebElement item_Field;
		
		
		public void ClickOnSelectCheckbox() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Select_Checkbox.click();
		}
		
		public void ClickOnRemoveButton() {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Remove_Button.click();
		}
		
		 public boolean isListItemRemoved() {
			 return item_Field.getText().contains("General (None)");
		    }
}
