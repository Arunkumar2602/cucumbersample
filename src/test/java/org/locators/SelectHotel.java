package org.locators;

import org.base.ReusableClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends ReusableClass{
     
	public SelectHotel() {
		PageFactory.initElements(driver, this);
		
	}
    
    @FindBy(id = "radiobutton_0")
    private WebElement radioBtn;
    
    @FindBy(id = "continue")
    private WebElement continueBtn;

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	public void hotel() {
		 btnClick(getRadioBtn());
		 btnClick(getContinueBtn());
	}

}
