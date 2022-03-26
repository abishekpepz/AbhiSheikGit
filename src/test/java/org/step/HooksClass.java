package org.step;


import org.base.NewReusable;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends NewReusable  {

		
	@Before
	public void beforeExecution() {
    getDriver();
    get("https://adactinhotelapp.com");
	maxmize();
	}
	
	@After
	public void afterExecution() {
      // driver.close();
	}
	
	
	
}
