package pack4;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,monochrome=true,plugin="json:target/cucumber-report.json")

public class runners {

}
