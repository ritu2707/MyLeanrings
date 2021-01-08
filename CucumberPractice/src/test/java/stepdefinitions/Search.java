package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	@Given("the search is there on Amazon page")
	public void the_search_is_there_on_amazon_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I am on the search page");
	}

	@When("I search {string} with price ${int}")
	public void i_search_with_price_$(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the product"+string+ "serached");
	}

	@Then("product with name is displayed")
	public void product_with_name_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("product is displayed");
	}


}
