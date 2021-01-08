package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orderssteps {
	
	@Given("a resistered user exists")
	public void a_resistered_user_exisits() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Step 1");
	}

	@Given("user logins the Amzon portal")
	public void user_logins_the_amzon_portal() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 11");
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 2");
	}

	@When("user enters valid password")
	public void user_enters_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3");
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 4");
	}

	@Then("user navigates to the Order page")
	public void user_navigates_to_the_order_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 5");
	}

	@When("user clicks on Order link")
	public void user_clicks_on_order_link() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 6");
	}

	@Then("user checks previous order details")
	public void user_checks_previous_order_details() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 7");
	}

	@When("user clicks on cancelled Link")
	public void user_clicks_on_cancelled_link() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 8");
	}

	@Then("user checks the cancelled order")
	public void user_checks_the_cancelled_order() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 9");
	}

}
