package pack5_Tags;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepdefn {
	
	
	@Given("the number is {int}")
	public void the_number_is(Integer num) {
		 System.out.println("-----------------------------------");
	    System.out.println("The number is " +num);
	}

	@And("add the number with {int}")
	public void add_the_number_with(Integer int1) {
	   System.out.println("Add the number with " +int1);;
	}

	@And("select the Enter button")
	public void select_the_Enter_button() {
		
		System.out.println("select the Enter button");
	    
	}

	@Then("result is displayed")
	public void result_is_displayed() {
		System.out.println("Result is displayed");
		 System.out.println("-----------------------------------");
	}

	@Given("sub the number with {int}")
	public void sub_the_number_with(Integer int1) {
	    System.out.println("sub the number with " +int1);
	    
	}

	
	@And("Multiply the number with {int}")
	public void multiply_the_number_with(Integer int1) {
	    System.out.println("Multiply the number with " +int1);
	   
	}

	

	@And("divide the number with {int}")
	public void divide_the_number_with(Integer int1) {
	    System.out.println("Delete the number with " +int1);
	
	}

	




}
