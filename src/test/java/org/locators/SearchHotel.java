package org.locators;

import org.base.ReusableClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends ReusableClass {
    
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}


	//Second page - Web elements for locators
	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement roomType;

	@FindBy(id = "room_nos")
	private WebElement roomNums;

	@FindBy(id = "datepick_in")
	private WebElement checkInDate;

	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;

	@FindBy(id = "adult_room")
	private WebElement adultRoom;

	@FindBy(id = "child_room")
	private WebElement childRoom;

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement submitDetails;

	//Getters

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNums() {
		return roomNums;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSubmitDetails() {
		return submitDetails;
	}
	
	public void searchHotel(String location, String hotels, String roomType, String roomNum,
			String checkIn, String checkOut, String adults, String children) {
		  selectDropDown(getLocation(), "visibleText",location );
		  selectDropDown(getHotel(), "visibleText",hotels );
		  selectDropDown(getRoomType(), "visibleText",roomType );
		  selectDropDown(getRoomNums(), "visibleText",roomNum );
		  sendText(getCheckInDate(),checkIn);
		  sendText(getCheckOutDate(),checkOut);
		  selectDropDown(getAdultRoom(), "visibleText",adults );
		  selectDropDown(getChildRoom(),"visibleText",children);
		  btnClick(getSubmitDetails());
		  
	}

}
