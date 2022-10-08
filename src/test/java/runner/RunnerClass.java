package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base_class.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="featureFiles/BackgroundExamples.feature",
		
		glue ="stepDefinitions",
		
		dryRun = true,
	 
		// publish = true,
		
		monochrome =true,
		
		//tags = ("@BackgroundExamples"),
		
		plugin = {
				
				"html:report/webReport.html",
				"json:report/jsonreport.json",
				"junit:report/xmlreport.xml",
				
		
		}
		
		
		)
public class RunnerClass {

	// it should combine feature file and the step definition
	// Runner define
	public static WebDriver driver; //----------------->null
	
	
    @BeforeClass
    public static void set_Up() {
    
  	  driver =Base_Class.Browser_config("chrome");
  	  
  	  
	}
    @AfterClass
    public static void tear_Down() {
	
  	  driver.quit();;
	}


	
}
