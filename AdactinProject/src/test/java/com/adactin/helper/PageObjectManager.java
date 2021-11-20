package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookHotel;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;


public class PageObjectManager {
	
	public static WebDriver driver;
	private HomePage hp;
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver= ldriver;

	}
	public HomePage getHp() {
		hp = new HomePage(driver);
		return hp;
		
	}
	
	private SearchHotel Sh;

	public SearchHotel getSh() {
		Sh = new SearchHotel(driver);
		return Sh;
	}

	private SelectHotel selectHotel;

	public SelectHotel getSelectHotel() {
		selectHotel = new SelectHotel(driver);
		return selectHotel;
	}
	
	private BookHotel BH;

	public BookHotel getBH() {
		BH = new BookHotel(driver);
		return BH;
	}
	
	
	
	
	
	
	
	
}
