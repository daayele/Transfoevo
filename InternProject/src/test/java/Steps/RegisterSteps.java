package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {

	@Given("user is on QA course webpage")
	public void user_is_on_qa_course_webpage() {
		System.out.println("Inside Step - user is on qa course page");
	}

	@When("the user partially fills registration form")
	public void the_user_partially_fills_registration_form() {
		System.out.println("Inside Step - the user partially fills registration form");
	}

	@And("the user clicks register")
	public void the_user_clicks_register() {
		System.out.println("Inside Step - the user clicks register");
	}

	@Then("the user will get error message")
	public void the_user_will_get_error_message() {
		System.out.println("Inside Step - the user will get error message");
	}


}
