package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.base_class.Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableWithHeaderDef extends Base_Class{
	
	
	@Given("Go to login page")
	public void go_to_login_page() {
		driver.get("https://www.facebook.com/login/");					

	}

	@When("enter the  credentials")
	public void enter_the_credentials(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
        // For other transformations you can register a DataTableType.
	List<Map<String,String>>keyValuePair=dataTable.asMaps(String.class, String.class);

	String userName=keyValuePair.get(0).get("UserName");
	String passWord=keyValuePair.get(0).get("Password");

	driver.findElement(By.id("email")).sendKeys(userName);
	driver.findElement(By.id("pass")).sendKeys(passWord);


	}
	@When("clicks fb login button")
	public void clicks_fb_login_button() {
		driver.findElement(By.name("login"));		

	}


	
	

}
