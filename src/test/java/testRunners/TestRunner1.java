package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	 features = "src/test/resourses/org/feature",
	 glue = {"org/stepdefination","com/applicationHooks"},
	 monochrome = true,
	 dryRun = false,
	// tags= "@smoke or @regression",
	 plugin = {"pretty",
			 //Reports 
			 "html:target/html_Report/html_report.html",
			 "junit:target/junit_Report/junit_Report.xml",
			 "json:target/json_Report/json_Report.json",
			 "com.avenstack.extendreports.cucumber.adaptor.ExtendCucumberAdaptor:",
			 // Configure for Failed TestCases
			 "rerun:target/failedReRun.txt"
	 
			 
	 }
	 
)
public class TestRunner1 {

}
