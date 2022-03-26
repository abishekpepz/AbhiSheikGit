package org.step;

import org.base.NewReusable;
import org.junit.Assert;
import org.openqa.selenium.By;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepClass extends NewReusable  {
	
	

	@When("App user should Enter username and Password")
	public void appUserShouldEnterUsernameAndPassword() {
       driver.findElement(By.id("username")).sendKeys("kumaru");
	   driver.findElement(By.id("password")).sendKeys("kokki");
	}

	@Then("App user should click login button")
	public void appUserShouldClickLoginButton() {
         driver.findElement(By.id("login")).click();
	}

	@Then("App user should verify success msg")
	public void appUserShouldVerifySuccessMsg() {
           String title = driver.getTitle();
          boolean b = title.contains("Hotel");
          Assert.assertTrue("verify title", b);
	}
	
	@When("user should Enter {string} and {string}")
	public void userShouldEnterAnd(String k, String l) {
		  driver.findElement(By.id("username")).sendKeys(k);
		   driver.findElement(By.id("password")).sendKeys(l);
	}

	@Then("user should click login button")
	public void userShouldClickLoginButton() {
        driver.findElement(By.id("login")).click();
	}

	@Then("user should verify success msg")
	public void userShouldVerifySuccessMsg() {
        String title1 = driver.getTitle();
        System.out.println(title1);
	}

}
