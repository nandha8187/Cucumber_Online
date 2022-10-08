package stepDefinitions;

import org.openqa.selenium.By;

import com.base_class.Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefWithData extends Base_Class{

	
	@Given("user is on  the login page")
	public void user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.get("https://www.facebook.com/login/");
			
	}


	@When("the user enters the valid credentials {string} and {string}")
	public void the_user_enters_the_valid_credentials_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	
	}
	@When("clicks the  the login button")
	public void clicks_the_the_login_button() {
	  // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("login"));		
	}
	@Then("the user should see the home page")
	public void the_user_should_see_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	
	}


	
	
	
	
	
}
