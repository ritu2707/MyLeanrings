package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\Hp\\eclipse-workspace\\BDDProject\\src\\main\\java\\Features\\login.feature"
		,glue= {"C:\\Users\\Hp\\eclipse-workspace\\BDDProject\\src\\main\\java\\StepDefenition\\TestStepDefenition.java"}
		)
public class TestRunner {
	
	

	
}
