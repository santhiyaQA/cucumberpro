package pack6_Features;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepdeveloper {
	
	@Given("the developer name is {string}")
	public void the_developer_name_is(String name) {
	   
	    System.out.println("____________________");
	    System.out.println("the developer name is" +name);
	}
	

	@And("the age is {int} for developer")
	public void the_age_is_for_developer(Integer Age) {
	    System.out.println("the age is  "+Age+" for developer");
	}

	@And("working on the Projects {string}")
	public void working_on_the_Projects(String string) {
	   System.out.println("Working on the Projects  "+string);
	}

	@Then("he is a software Developer")
	public void he_is_a_software_Developer() {
	    System.out.println("he is a Software Developer");
	    System.out.println("________________");
	}

}
