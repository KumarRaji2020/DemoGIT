package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/GmailAccountLogin.feature",
		glue="steps/GmailAccountSteps") // steps location
		//strict = true,
	//	monochrome=true,
//		tags= {"@game"}// 0 test scenario
//		tags= {"@game-fizz"}// 1 test scenario with given tag
//		tags= {"@game-buzz or @game-fizz"}// 2 test scenarios with given tags
//		plugin= {
//			"pretty",
//			"json:target/json/output.json",
//			"html:target/cucumber"
//		}
	
public class RunnerClass{
}
