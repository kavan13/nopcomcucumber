package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I see welcome message display$")
    public void iSeeWelcomeMessageDisplay() {
        new LoginPage().getWelcomeText();
    }

    @And("^I enter email id \"([^\"]*)\"$")
    public void iEnterEmailId(String email)  {
        new LoginPage().enterEmailId(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);

    }

    @And("^I click login$")
    public void iClickLogin() {
        new LoginPage().clickOnLoginButton();
    }

    @And("^I can see error message$")
    public void iCanSeeErrorMessage() {
        new LoginPage().getErrorMessage();
    }

    @And("^I can see logout link display$")
    public void iCanSeeLogoutLinkDisplay() {
        new HomePage().isLogOutLinkDisplay();
    }

    @And("^I click on logout button$")
    public void iClickOnLogoutButton() {
        new HomePage().clickOnLogOutLink();
    }

    @Then("^I see login link display$")
    public void iSeeLoginLinkDisplay() {
        new HomePage().isLogInLinkDisplay();
    }
}
