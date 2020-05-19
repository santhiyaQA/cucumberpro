package pack3;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\sele\\Cucum-T3\\common\\src\\test\\java\\pack3resources",
glue="pack3",strict = true,monochrome=true,plugin="json:target/cucumber-report.json")

public class runners {

}

