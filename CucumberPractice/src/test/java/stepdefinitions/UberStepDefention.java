package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberStepDefention {
	
	@Given("Uber app is open")
	public void uber_app_is_open() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Step 1");
	}

	@When("user selects car type {string}")
	public void user_selects_car_type(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Step 2");
	}

	@When("user selects source as {string} and destination as {string}")
	public void user_selects_source_as_and_destination_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Step 3");
	}

	@Then("Driver starts the journey after Entering OTP")
	public void driver_starts_the_journey_after_entering_otp() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Step 4");
	}

	@Then("Driver ends the joruney")
	public void driver_ends_the_joruney() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Step 5");
	}

	@Then("User pays money via Google Pay USD {int}")
	public void user_pays_money_via_google_pay_usd(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Step 6");
	}



}
