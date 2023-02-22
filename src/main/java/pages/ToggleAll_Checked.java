package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleAll_Checked {

    WebDriver driver;
	
	public ToggleAll_Checked(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how= How.CSS , using="input[name='allbox']")WebElement ToggleAll_Button;
	@FindBy(how = How.CSS, using = "input[type='checkbox']")WebElement All_CheckBox;
	
	
	public void clickOnToggleAll() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ToggleAll_Button.click();
	}
	
	public void validateAllBoxAreChecked() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean x = All_CheckBox.isSelected();
		
		if(x==true) {
			System.out.println("All checkbox is CHECKED ON!");
		}else {
			System.out.println("Check box is still unchecked");
		}
	}
}
