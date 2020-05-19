package pack6_Features;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepTest {
	
	@Given("the Tester name is {string}")
	public void the_Tester_name_is(String Name) {
	    System.out.println("the Tester name is" +Name);
	}

	@And("the age is {int} for Tester")
	public void the_age_is_for_Tester(Integer Age) {
		System.out.println("the Tester age is" +Age);
	    
	}

	@And("working on the Project {string}")
	public void working_on_the_Project(String Projectname) {
		System.out.println("working on the Project " +Projectname);

	}

	@Then("he is a software Tester")
	public void he_is_a_software_Tester() {
		System.out.println("he is a software Tester");
	}



}
