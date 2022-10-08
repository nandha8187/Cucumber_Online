package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base_class.Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends Base_Class{

	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
			 driver.get("https://www.facebook.com/login/");
		}
	@When("the user enters the valid username and password")
	public void the_user_enters_the_valid_username_and_password() {
	
		driver.findElement(By.id("email")).sendKeys("nandharaina0310@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Geetha1426");
		
	  }

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
	
		driver.findElement(By.name("login"));
		
	}
	@Then("the user should be navigated to home page")
	public void the_user_should_be_navigated_to_home_page() throws InterruptedException {
	   
		WebElement search = driver.findElement(By.xpath("(//label[contains(@class,'icdlwmnq ')])[1]"));
	    search.click();
	  Thread.sleep(3000);
	}


}
