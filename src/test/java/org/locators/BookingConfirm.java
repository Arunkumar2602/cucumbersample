package org.locators;

import org.base.ReusableClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirm extends ReusableClass{
     
	public BookingConfirm() {
		PageFactory.initElements(driver, this);
	}

  @FindBy(id = "order_no")
  private WebElement orderIdAttribute;
  
  

public WebElement getOrderIdAttribute() {
	return orderIdAttribute;
}

     public void bookOrder() throws InterruptedException {
    	 String attributeValue = getAttributeValue(getOrderIdAttribute());
    	 System.out.println("Order ID: "+ attributeValue);
    	 Thread.sleep(5000);
    	 driver.quit();
	}

}

