package pack1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepdefn {
	@Given("the Tester name is {string}")
	public void the_Tester_name_is(String Name) {
	   System.out.println("the Tester name is " +Name);
	}

	@And("the age is {string} for Tester")
	public void the_age_is_for_Tester(String Age) {
	    System.out.println("the age is "+Age+" for Tester");
	}

	@And("working on the Project {string}")
	public void working_on_the_Project(String ProjectName) {
	    System.out.println("working on the Project " +ProjectName);
	}

	@Then("he is a {string}")
	public void he_is_a(String Designation) {
		 System.out.println("he is a " +Designation);
	}

	
}
