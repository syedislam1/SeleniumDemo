package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\Gmail_Demo\\selenium\\src\\main\\java\\feature", glue = { "stepDefinition" })
public class TestRunner {

}
