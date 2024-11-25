package com.framework.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
	    features = "src/test/resources/features", 
	    glue = {"com.framework.stepdefinitions", "com.framework.hooks"}, 
	    plugin = {
	        "pretty", 
	        "html:target/cucumber-reports/CucumberReport.html", 
	        "json:target/cucumber-reports/CucumberReport.json" 
	    },
	    monochrome = true, 
	    dryRun = false, 
	    tags = "@Smoke" 
	)
	public class TestRunner extends AbstractTestNGCucumberTests {
	}

