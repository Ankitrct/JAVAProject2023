package Rest.Auto;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = { "pretty", "html:target/cucumber-reports/report.html" , "json:target/jsonReports/report.json"},
		glue = {"stepDefinations"},
		tags = "@NestedAPI"
		//monochrome = true

)

public class TestRunner {

}
