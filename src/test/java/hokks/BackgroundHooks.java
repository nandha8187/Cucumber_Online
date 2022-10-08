package hokks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BackgroundHooks {
 
	@Before
	public void beforeScenario() {
		System.out.println("This will run before all scneraios");
	}
	
	@After
	public void afterScnario() {
		System.out.println("This will run after all scenaios");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
