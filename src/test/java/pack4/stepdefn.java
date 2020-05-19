package pack4;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepdefn {

	
	
	@Given("^the number is [0-9]+$")
	public void the_number_is_50() {
		System.out.println("-----------------------");
        System.out.println("Enter 50 in the calculator");
        
        }

   
    @And("^add the number with [0-9]+$")
    public void add_the_number_with_20() {
    	
    	System.out.println("Add the number with 20");
        
    }

    @And("^select the Enter button$")
    public void select_the_Enter_button() {
        System.out.println("Enter equal button");
    }

    @Then("^result is displayed$")
    public void result_is_displayed() {
       System.out.println("Result is displayed");
      System.out.println("---------------------------------"); 
    }

   

    @And("^sub the number with [0-9]+$")
    public void sub_the_number_with_30() {
    	
    	System.out.println("Sub the number with 30");
        
    }

   
}
