package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by vens on 3/22/2017.
 */

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/feature"},format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"}, glue= "steps")
public class TestRunner extends AbstractTestNGCucumberTests {
}
