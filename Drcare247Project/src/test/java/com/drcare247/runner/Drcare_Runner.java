package com.drcare247.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Cucumber\\Drcare247Project\\src\\test\\java\\com\\drcare247\\featurefile\\Drcare247.feature",
                              glue="")        

public class Drcare_Runner {

}
