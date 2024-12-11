package com.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"./src/test/resources/Features/editFeatureF.feature"},
			glue = {"com/stepdefs"},
			dryRun = false,
			monochrome = true,
			publish = true,
			plugin = {"pretty","html:target/cucumber-html-reports"}
		)

public class editTestRunner
{

}
