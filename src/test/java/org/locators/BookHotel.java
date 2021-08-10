package org.locators;

import java.util.List;
import java.util.Map;

import org.base.ReusableClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends ReusableClass{

	public BookHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement cardNumber;

	@FindBy(id = "cc_type")
	private WebElement cardType;

	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;

	@FindBy(id = "cc_cvv")
	private WebElement cvvNumber;

	@FindBy(id = "book_now")
	private WebElement bookNowBtn;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}

	public void bookHotel(String fName, String lName, String address) {
		sendText(getFirstName(),fName);
		sendText(getLastName(),lName);
		sendText(getAddress(),address);
	}
	public void payment(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> card = dataTable.asMaps();
		Map<String,String> m = card.get(1);
		String cardNo = m.get("creditno");
		sendText(getCardNumber(),cardNo);

		String cardType = m.get("cardtype");
		sendText(getCardType(),cardType);

		String expiryMonth = m.get("expiryM");
		sendText(getExpiryMonth(),expiryMonth);

		String expiryYear = m.get("expiryY");
		sendText(getExpiryYear(),expiryYear);

		String cVV = m.get("cvv");
		sendText(getCvvNumber(),cVV);
		
		btnClick(getBookNowBtn());
		



	}


}
