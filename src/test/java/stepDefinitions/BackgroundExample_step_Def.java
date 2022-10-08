package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundExample_step_Def {

	@Given("The student finished high school")
	public void the_student_finished_high_school() {
        System.out.println("The student finished high school");
	}
	
	@Given("the student finished higher secodary")
	public void the_student_finished_higher_secodary() {
        System.out.println("the student finished higher secondary");
	}
 	
	@Given("the student applied for the medical course")
	public void the_student_applied_for_the_medical_course() {
		System.out.println("the student applied for the medical course");
	}

	@When("the student cleared the entrance exam")
	public void the_student_cleared_the_entrance_exam() {
		System.out.println("the student cleared the entrance exam");
	}
	@Then("the student is eligible for joining any Medical institute")
	public void the_student_is_eligible_for_joining_any_medical_institute() {
		System.out.println("the student is eligible for joining medical institute");
	}
	@Given("the student applied for the engineering course")
	public void the_student_applied_for_the_engineering_course() {
		System.out.println("the student applied for the engineering course");
	}

	@When("the student has a sayable cut off")
	public void the_student_has_a_sayable_cut_off() {
		System.out.println("the student has a sayable cut off");
	
	}
	@Then("the student is eligible for joining any engineering Institute")
	public void the_student_is_eligible_for_joining_any_engineering_institute() {
         System.out.println("the student is eligible for joinng institute");
         
	}




}
