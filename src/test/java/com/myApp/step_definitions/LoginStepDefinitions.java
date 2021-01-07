package com.myApp.step_definitions;

import io.cucumber.java.en.*;


public class LoginStepDefinitions {
    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("user is on the landing page");
    }

    @When("user enters credentials")
    public void user_enters_credentials() {
        System.out.println("user enters credentials");
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        System.out.println("user clicks login button");
    }
    @Then("user should see welcome message")
    public void user_should_see_welcome_message() {
        System.out.println("user should see welcome message");
    }

}
