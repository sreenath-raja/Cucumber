package com.adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.HomePage;
import com.adactin.pom.SelectHotel;
import com.adactinsite.runner.Runner;
import com.project.baseclass.BaseClsMaven;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClsMaven {
	
	public static WebDriver driver=Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	@Given("^User Launch the Adactin Application$")
	public void user_Launch_the_Adactin_Application() throws IOException  {
		/*
		 * driver = Getbrowser("chrome");  geturl("https://adactinhotelapp.com/");
		 */
		String url = FileReaderManager.getInstance().getCrInstance().geturl();
		geturl(url);
	}

	@When("^User Enter valid \"([^\"]*)\" in the username field$")
	public void user_Enter_valid_in_the_username_field(String username)  {
		//HomePage hp = new HomePage(driver);
		inputtoElement(pom.getHp().getUsername(),username); 
	}

	@When("^User Enter valid \"([^\"]*)\" in password field$")
	public void user_Enter_valid_in_password_field(String password) {
		//HomePage hp = new HomePage(driver);
		inputtoElement(pom.getHp().getPassword(), password);
	    
	}

	@When("^User clicks the Login Button$")
	public void user_clicks_the_Login_Button() {
		//HomePage hp = new HomePage(driver);
		clickonElement(pom.getHp().getLogin());
	   
	}

	@Then("^User navigates to the search hotel page$")
	public void user_navigates_to_the_search_hotel_page() {
	    
	}

	@Given("^It navigates to search hotel page$")
	public void it_navigates_to_search_hotel_page()  {
	    
	}

	@When("^User Select the location$")
	public void user_Select_the_location()  {
		//SelectHotel sh = new SelectHotel(driver);
		Selection(pom.getSh().getLocation(),"byindex", "2");
	    
	}

	@When("^User Select the Hotel$")
	public void user_Select_the_Hotel()  {
		Selection(pom.getSh().getHotels(), "byindex", "2");
	   
	}

	@When("^User Select the Room Type$")
	public void user_Select_the_Room_Type()  {
		Selection(pom.getSh().getRoomType(), "byindex", "3");
	    
	}

	@When("^User choose the CheckInDate$")
	public void user_choose_the_CheckInDate()  {
		inputtoElement(pom.getSh().getCheckInDate(), "15/01/2021");
	    
	}
	
	@When("^User choose the CheckOutDate$")
	public void user_choose_the_CheckOutDate()  {
		inputtoElement(pom.getSh().getCheckOutDate(), "16/01/2021");
	   
	}

	@When("^User Select the AdultsPerRoom$")
	public void user_Select_the_AdultsPerRoom()  {
		Selection(pom.getSh().getAdultsPerRoom(), "byindex", "2");
	   
	}

	@When("^User Select the ChildrensPerRoom$")
	public void user_Select_the_ChildrensPerRoom()  {
		Selection(pom.getSh().getChildrensPerRoom(), "byindex", "2");
	   
	}
	
	@When("^User click the search button$")
	public void user_click_the_search_button()  {
		clickonElement(pom.getSh().getSearch());

	}

	@Then("^User navigates to Select Hotel page$")
	public void user_navigates_to_Select_Hotel_page()  {
	   
	}

	@When("^User select the hotel which is displayed\\.$")
	public void user_select_the_hotel_which_is_displayed()  {
	   //SelectHotel selecthotel = new SelectHotel(driver);
		clickonElement(pom.getSelectHotel().getSelect());
	}

	@When("^User click the continue button$")
	public void user_click_the_continue_button()  {
		clickonElement(pom.getSelectHotel().getContinue());
	    
	}

	@Then("^User navigates to Book a Hotel Page$")
	public void user_navigates_to_Book_a_Hotel_Page()  {
	   
	}

	@Given("^It navigates to book a hotel page$")
	public void it_navigates_to_book_a_hotel_page()  {
	    
	}

	@When("^User enters the First Name$")
	public void user_enters_the_First_Name() {
		inputtoElement(pom.getBH().getFirstName(), "Sreenath");
	    
	}

	@When("^User enter the LastName$")
	public void user_enter_the_LastName() {
		inputtoElement(pom.getBH().getLastName(), "sree");
	    
	}

	@When("^User enter the Billing Address$")
	public void user_enter_the_Billing_Address()  {
		inputtoElement(pom.getBH().getAddress(), "California");
	    
	}

	@When("^User enter the CreditCardNo$")
	public void user_enter_the_CreditCardNo() {
		inputtoElement(pom.getBH().getCCNO(), "2123454312349876");
		
	}
	
	@When("^User Select the CreditCard Type$")
	public void user_Select_the_CreditCard_Type() {
		Selection(pom.getBH().getCCtype(), "byindex", "2");
	   
	}

	
	@When("^User Select the Expire Date for month$")
	public void user_Select_the_Expire_Date_for_month()  {
	   Selection(pom.getBH().getExpMonth(), "byindex", "4");
	}

	@When("^User Select the Expire Date of year$")
	public void user_Select_the_Expire_Date_of_year()  {
		Selection(pom.getBH().getExpYear(), "byindex", "11");
	    
	}

	@When("^User Enter the CVV$")
	public void user_Enter_the_CVV() {
		inputtoElement(pom.getBH().getCVV(), "234");
		
	}


	@When("^click the BookNow Button$")
	public void click_the_BookNow_Button()  {
		clickonElement(pom.getBH().getBookNow());
	    
	}


}
