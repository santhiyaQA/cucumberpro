package pack5_Tags;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true,
		tags = {"@Addition","@divide" },
		plugin= {"json:target/cucumber-report.json",
				"junit:target/cucumber1-report.junit"
				, "html:target/cucumber2-report.html"}
		//tags = {"@Sub,@divide" }
		
		
		)

public class Runners {

}
