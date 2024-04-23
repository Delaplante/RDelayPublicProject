package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.basePageObjects;
import utility.browserDriver;

public class baseStepsObjects extends basePageObjects {
    basePageObjects basePage = new basePageObjects();
    public baseStepsObjects() {
    }
    @Given("User navigates to the page")
    public void userNavigatesToPage() {
        browserDriver.driver.get("https://login.common.naic.org/");
    }

    @When("User clicks login")
    public void userClicksLogin() throws InterruptedException {
        basePage.clickLogin();
    }

    @And("User enters username {string}")
    public void userEntersUsername(String user) throws InterruptedException {
        basePage.enterUsername(user);
    }

    @And("User enters password {string}")
    public void userEntersPassword(String pass) {
        basePage.enterPassword(pass);
    }

    @And("User clicks the log in button")
    public void userClicksTheLogInButton() {
        basePage.clickLogin();
    }

    @Then("User is verified to have logged in")
    public void userIsVerifiedToHaveLoggedIn() {
    }

    @And("User enters {string} in the search bar")
    public void userEntersInTheSearchBar(String value) {
        searchFor(value);
    }

    @Then("User Clicks the video link")
    public void userClicksTheVideoLink() {
    }

    @Then("User inputs {string} in the username field")
    public void userInputsInTheUsernameField(String user) {
        basePage.enterUsername(user);
    }

    @And("User inputs {string} in the password field")
    public void userInputsInThePasswordField(String pass) {
        basePage.enterPassword(pass);
    }

    @And("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
        basePage.clickLogin();
    }

    @Then("User should see the error message")
    public void userShouldSeeTheErrorMessage() {

    }

    @Then("User should see the error message {string}")
    public void userShouldSeeTheErrorMessage(String message) {
        basePage.verifyErrorMessageText(message);
    }

    @And("User should not be logged in")
    public void userShouldNotBeLoggedIn() {
    }

    @Then("I click forgot password link")
    public void iClickForgotPasswordLink() {
        basePage.clickForgotPassword();
    }

    @Then("I input {string} into the username search field")
    public void iInputIntoTheUsernameSearchField(String name) {
        basePage.searchForUsername(name);
    }

    @Then("I click the search button")
    public void iClickTheSearchButton() {
        basePage.clickSearch();
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String message) {
        basePage.verifyUserNotFound(message);
    }

    @Then("I click the cancel button")
    public void iClickTheCancelButton() {
        basePage.clickCancel();
    }

    @Then("I should see the login page")
    public void iShouldSeeTheLoginPage() {
        assert browserDriver.driver.getCurrentUrl().equals("https://login.common.naic.org/");
    }
}
