package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources/Features", 
		glue={"stepDefinitions"},
		plugin= {"pretty","json:target/cucumber.json", "junit:junit_xml/cucumber.xml"}, 
		monochrome=true,
		publish = true
		//tags ="@End2end"
		)

public class MyRunner {
	

}
