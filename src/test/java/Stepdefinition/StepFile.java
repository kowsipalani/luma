package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lumaBase.Baseclass;
import pom.Login;

public class StepFile extends Baseclass {
	
	Login log = new Login();
	
	@Given("User launch the magneto url")
	public void user_launch_the_magneto_url() {
		BrowserLaunch("https://magento.softwaretestingboard.com/");   
	}

	@When("User click the SignIn tab")
	public void user_click_the_sign_in_tab() {
		driver.findElement(log.SignIn).click();
	   
	    
	}

	@When("User enter the mail id")
	public void user_enter_the_mail_id() {
	   driver.findElement(log.mail).sendKeys("kowsalya2596@gmail.com");
	}

	@When("User enter the password")
	public void user_enter_the_password() {
		driver.findElement(log.Password).sendKeys("Kowsi2504");
	   
	}

	@When("User click the SignIn button to enter the Homepage")
	public void user_click_the_sign_in_button_to_enter_the_homepage() {
	   driver.findElement(log.signinbutton).click();
	    
	}

	@Then("User successfully signedIn into the web application")
	public void user_successfully_signed_in_into_the_web_application() {
	   System.out.println("User successfully logged into page");
	    
	}
	
	@Given("User click the whatsnew tab")
	public void user_click_the_whatsnew_tab() {
	   driver.findElement(log.whatsnew).click();
	    
	}

	@When("User click the Jackets")
	public void user_click_the_jackets() {
		driver.findElement(log.jackets).click();
	   
	    
	}

	@When("User click the Juno Jacket in that page")
	public void user_click_the_juno_jacket_in_that_page() {
	   driver.findElement(log.junojacket).click();
	    
	}

	@When("User pick the size of the jacket")
	public void user_pick_the_size_of_the_jacket() {
		driver.findElement(log.size).click();
	   
	    
	}
	@When("User Pick the colour of the jacket")
	public void user_pick_the_colour_of_the_jacket() {
		driver.findElement(log.colour).click();
   
}

	@When("User pick the quantity of the jacket")
	public void user_pick_the_quantity_of_the_jacket() {
    driver.findElement(log.qty).clear();
    driver.findElement(log.qty).sendKeys("2");
}
	@When("User click the Add to Cart button")
	public void user_click_the_add_to_cart_button() {
	   driver.findElement(log.cart).click();
	    
	}

	@Then("User successfully ada the product to the cart")
	public void user_successfully_ada_the_product_to_the_cart() {
	   System.out.println("Product added to the cart successfully");
	    
	}


}
