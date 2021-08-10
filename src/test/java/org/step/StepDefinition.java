package org.step;

import java.util.List;
import java.util.Map;

import org.base.ReusableClass;
import org.locators.BookHotel;
import org.locators.BookingConfirm;
import org.locators.LoginPage;
import org.locators.SearchHotel;
import org.locators.SelectHotel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends ReusableClass{


	static BookHotel book;

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
               
	}

	@When("User should enter {string} {string} and click login button")
	public void user_should_enter_and_click_login_button(String user, String password) {
		LoginPage log = new LoginPage();
        log.login(user, password);
	}

	@When("User should select all the fields {string} {string} {string} {string} {string} {string} {string} {string}")
	public void user_should_select_all_the_fields(String location, String hotels, String roomType, String roomNum,String checkIn, String checkOut, String adults, String children) {
		   SearchHotel search = new SearchHotel();
		   search.searchHotel(location, hotels, roomType, roomNum, checkIn, checkOut, adults, children);
		 }

	@When("User should click hotel and click Continue button")
	public void user_should_click_hotel_and_click_Continue_button() {
		SelectHotel sh = new SelectHotel();
		sh.hotel();
	}

	@When("User should select all the fields {string} {string} {string}")
	public void user_should_select_all_the_fields(String fName, String lName, String address) {
		 book = new BookHotel();
		 book.bookHotel(fName, lName, address);
		 
	}

	@When("User should  enter")
	public void user_should_enter(io.cucumber.datatable.DataTable dataTable) {
          book.payment(dataTable);
		
	}
	@Then("User should get Order ID")
	public void user_should_get_Order_ID()throws InterruptedException {
		BookingConfirm bookingId = new BookingConfirm();
            bookingId.bookOrder();
		
	}




}
