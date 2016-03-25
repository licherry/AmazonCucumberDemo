package com.thoughtworks.lichen;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by chenli on 3/25/16.
 */
public class LoginStepdefs {
    @Given("^User is on Home Page$")
    public void userIsOnHomePage() throws Throwable {
        System.out.println("test");
    }

    @When("^User Navigate to Login Page$")
    public void userNavigateToLoginPage() throws Throwable {
        System.out.println("test");
    }

    @And("^User enters UserName and Password$")
    public void userEntersUserNameAndPassword() throws Throwable {
        System.out.println("test");
    }

    @Then("^Navigate to Personal Home Page$")
    public void navigateToPersonalHomePage() throws Throwable {
        System.out.println("test");
    }
}
