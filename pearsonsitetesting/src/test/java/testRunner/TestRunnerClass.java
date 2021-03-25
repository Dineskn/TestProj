package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./pearsonsitetesting/featureFiles/SearchTextinPearson.feature", glue={"stepDefinitions"})
public class TestRunnerClass {
	

}
