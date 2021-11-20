package com.adactinsite.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.project.baseclass.BaseClsMaven;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features  = "src\\test\\java\\com.adactinsite.featurefile\\adactinscenario.feature",
                         glue="com\\adactin\\stepdefinition",
                         monochrome = true,
                         dryRun = false,
                       strict = true)
public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException {
		String browsername = FileReaderManager.getInstance().getCrInstance().getbrowsername();
		 driver = BaseClsMaven.Getbrowser(browsername);
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
 