package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
	public static WebDriver driver;
	@FindBy(id = "first_name")
	private WebElement FirstName;
	
	@FindBy(id = "last_name")
	private WebElement LastName;
	
	@FindBy(id = "address")
	private WebElement Address;
	
	@FindBy(id = "cc_num")
	private WebElement CCNO;
	
	@FindBy(id = "cc_type")
	private WebElement CCtype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement ExpMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement ExpYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement CVV;
	
	@FindBy(id="book_now")
	private WebElement BookNow;
	

	public BookHotel(WebDriver driver4) {
		this.driver = driver4;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCCNO() {
		return CCNO;
	}

	public WebElement getCCtype() {
		return CCtype;
	}

	public WebElement getExpMonth() {
		return ExpMonth;
	}

	public WebElement getExpYear() {
		return ExpYear;
	}

	public WebElement getCVV() {
		return CVV;
	}
	
	public WebElement getBookNow() {
		return BookNow;
	}

}
