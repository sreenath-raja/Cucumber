package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {

public static WebDriver driver;
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement Location;
	
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement Hotels;
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement RoomType;
	
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement NumberOfRooms;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement CheckInDate;
	
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement CheckOutDate;
	
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement AdultsPerRoom;
	
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement ChildrensPerRoom;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement Search;
	

	public SearchHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getNumberOfRooms() {
		return NumberOfRooms;
	}

	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return AdultsPerRoom;
	}

	public WebElement getChildrensPerRoom() {
		return ChildrensPerRoom;
	}
	
	public WebElement getSearch() {
		return Search;
	}
}
