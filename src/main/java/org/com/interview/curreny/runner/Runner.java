package org.com.interview.curreny.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/functionalTests", glue = {
		"org.com.interview.curreny.stepDef" }, plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml",
				"html:target/cucumber-reports" }, monochrome = true)
public class Runner {

}
