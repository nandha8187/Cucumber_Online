package stepDefinitions;

import io.cucumber.java.en.Given;

public class ExpressionStepDef {

	@Given("I have {int} laptop")
	public void i_have_laptop(Integer count) {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Laptop count "+ count);
	}

	@Given("I have a {double} CGPA")
	public void i_have_a_cgpa(Double num) {
         // Write code here that turns the phrase above into concrete actions
		System.out.println("CGPA is "+num);
	}
	@Given("{string} is elder to {string}")
	public void is_elder_to(String name1, String name2) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(name1 +" is elder to "+ name2 );
	}

}
