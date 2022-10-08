package stepDefinitions;

import org.openqa.selenium.By;

import com.base_class.Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableWithExample extends Base_Class {

	
	@Given("Proceed to login page")
	public void proceed_to_login_page() {
		driver.get("https://www.facebook.com/login/");					
	}

	@When("user enters {string} and password {string}")
	public void user_enters_and_password(String userName, String passWord) {
	
	driver.findElement(By.id("email")).sendKeys(userName);
	driver.findElement(By.id("pass")).sendKeys(passWord);

	}
	@When("clicked button")
	public void clicked_button() {
		driver.findElement(By.name("login"));		

	}

	
	
	
	
	
	
	
	
}
