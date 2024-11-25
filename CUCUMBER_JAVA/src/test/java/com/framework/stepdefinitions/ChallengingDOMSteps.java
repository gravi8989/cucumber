package com.framework.stepdefinitions;

import com.framework.base.BaseTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChallengingDOMSteps extends BaseTest{

	@Given("I am on the home page")
	public void i_am_on_the_home_page() {
		System.out.println("Hi hello welcome");
	}

	@When("I click on the {string} link")
	public void i_click_on_the_link(String string) {
		
	}

	@Then("I click the {string} button1")
	public void i_click_the_button1(String string) {
		
	}
	
	@Then("I click the {string} button2")
	public void i_click_the_button2(String string) {
		
	}

	@Then("I click the {string} button3")
	public void i_click_the_button_again(String string) {
		
	}

}
