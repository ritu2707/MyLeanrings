package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/main/java/resources/Uber.feature"},
		glue= {"stepdefinitions"},
		tags="smoke",
		plugin= {"pretty"}
		)
public class UberTestRunner {

	
	
}
