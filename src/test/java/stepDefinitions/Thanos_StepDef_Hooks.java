package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Thanos_StepDef_Hooks {

	
	@Given("Thanos has the Inifinity Stones")
	public void thanos_has_the_inifinity_stones() {
		System.out.println("Thanos has the Infinity stones");
	}

	@When("Thanos snaps his fingers")
	public void thanos_snaps_his_fingers() {
		System.out.println("Thanos snaps his fingers");
		
	}
	@Then("half of the living things died")
	public void half_of_the_living_things_died() {
		System.out.println("half of the living things died");
		
	}



	
	
	
	
	
	
	
	
	
	
}
