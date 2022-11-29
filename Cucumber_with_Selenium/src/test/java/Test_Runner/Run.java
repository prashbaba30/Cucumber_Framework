package Test_Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith (Cucumber.class)
@CucumberOptions(

		features = ".//Features/LoginPage.feature",
		glue = "StepDefinations",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber-report/report1.html"}
	// plugin = {"pretty", "json:target/cucumber-report/report1.json"}
	// plugin = {"pretty", "junit:target/cucumber-report/report1.junit"}
		)


public class Run {

}
