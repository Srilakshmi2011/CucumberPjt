package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		monochrome=true,
				plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
		features= "src/test/java/features",
		glue="stepdefs",
		//tags= {"@Regression or @Sanity"} // or condition 
		//tags= {"@Regression and @Sanity"} // and condition
		//tags= {"@Calculator"} // feature level tag
		tags= {"@Login and not @WIP"} // do not execute WIP
		)

public class TestRunner {

}
