package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement Username;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement Password;
	
	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement Login;
	
	public HomePage(WebDriver driver1) {
		this.driver= driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}
	

}
