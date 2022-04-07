package stepDefination;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_stepDefination 
{
	@Given("User is on Login page")
	public void user_is_on_login_page() {
	   System.out.println("User is on login page");
	}
	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
	   System.out.println("User enters username as "+string);
	   System.out.println("User enters password as "+string2);
	}
	@When("clicks on login button")
	public void clicks_on_login_button() {
	   System.out.println("User clicked on login button");
	}
	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
	    System.out.println("User logged in successfully");
	}
	@Then("{string} page displayed")
	public void page_displayed(String string) {
	    System.out.println("User landed on "+string+" page");
	}
	
	@Given("User is on landing page")
	public void user_is_on_landing_page() {
	   System.out.println("User is on landing page");
	}
	
	@When("User clicks on Sign Up link")
	public void user_clicks_on_sign_up_link() {
		System.out.println("User clicked on sign up link");
	}
	@And("User enters following details")
	public void user_enters_following_details(DataTable datatable) {
		List<List<String>> obj = datatable.asLists();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
	}
	@Then("Welcome screen is displayed")
	public void welcome_screen_is_displayed()
	{
		System.out.println("Welcome screen is displayed");
	}
	
	 @When("^User enters user name as (.+) and password as (.+)$")
	    public void user_enters_user_name_as_and_password_as(String username, String password) throws Throwable 
	 {
	       System.out.println("username "+username);
	       System.out.println("password "+password);
	       }
}
