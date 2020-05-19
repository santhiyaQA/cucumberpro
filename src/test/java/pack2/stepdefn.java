package pack2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepdefn {
	
	@Given("the number is first")
	public void the_number_is_first() {
		System.out.println("--------------------");
	   System.out.println("First line");
	}

	@And("add the number with second")
	public void add_the_number_with_second() {
		 System.out.println("add Second line");
	}
	
	@And("sub the number with second")
	public void sub_the_number_with_second() {
		 System.out.println("Sub Second line");
	}

	@And("select the Enter button")
	public void select_the_Enter_button() {
		 System.out.println("Result line");
	}
	
	


	@Then("result is displayed")
	public void result_is_displayed() {
		 System.out.println("Result displayed");
		 System.out.println("--------------------");
	}


}
