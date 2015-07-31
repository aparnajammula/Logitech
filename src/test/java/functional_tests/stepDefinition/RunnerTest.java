package functional_tests.stepDefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"}
        ,tags = {"@regression"}
        ,format = {"pretty","json:target/cucumber-json-report.json","html:target/cucumber-html-report","junit:TestResults/junit/junit.xml"}
)
public class RunnerTest {}