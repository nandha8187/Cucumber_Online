package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;

import com.base_class.Base_Class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableWithoutHeaderDef extends Base_Class {
	
	
	@Given("You are on  the login page")
	public void you_are_on_the_login_page() {
    
		 driver.get("https://www.facebook.com/login/");					
	}
    @When("You enters below valid credentials")
	public void you_enters_below_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
    	List<String> credentials = dataTable.asList(String.class);
    	String username = credentials.get(0);
    	String password = credentials.get(1);
    	
    	driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	
   }
		


	
	
	


}
